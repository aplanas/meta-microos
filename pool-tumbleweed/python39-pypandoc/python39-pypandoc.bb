SUMMARY = "Thin wrapper for pandoc"
DESCRIPTION = "pypandoc provides a thin wrapper for pandoc, a universal document converter."
LICENSE = "MIT"

PV = "1.11"

RPM_NAME = "python39-pypandoc-1.11-1.4.noarch.rpm"
RPM_HASH = "cd91e81fc4ab71bb8606fac19899a180a6d632aa17c01af6db154859eaa15c11d84693fd77158a6f6e5f61260855bca2000952973aef81a60d6655edd6547b3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pypandoc \
python39-pypandoc \
python3dist-pypandoc"

RDEPENDS:${PN} += "pandoc \
python-abi \
python39-pip \
python39-wheel"

inherit rpm
