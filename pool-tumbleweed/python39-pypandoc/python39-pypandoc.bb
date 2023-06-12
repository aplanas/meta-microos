SUMMARY = "Thin wrapper for pandoc"
DESCRIPTION = "pypandoc provides a thin wrapper for pandoc, a universal document converter."
LICENSE = "MIT"

PV = "1.11"

RPM_NAME = "python39-pypandoc-1.11-1.1.noarch.rpm"
RPM_HASH = "0ac7d401a50b7c4074c954ff5e2d743771722c8121409bab30a4fcb8a5535fad8a1c6ceee5149043fab29d7a97c5e6271e6762cb52e1954615d49b9a51912559"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pypandoc) \
python39-pypandoc \
python3dist(pypandoc)"
RDEPENDS:${PN} += "pandoc \
python(abi) \
python39-pip \
python39-wheel"

inherit rpm
