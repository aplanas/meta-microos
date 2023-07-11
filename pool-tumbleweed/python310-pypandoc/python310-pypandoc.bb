SUMMARY = "Thin wrapper for pandoc"
DESCRIPTION = "pypandoc provides a thin wrapper for pandoc, a universal document converter."
LICENSE = "MIT"

PV = "1.11"

RPM_NAME = "python310-pypandoc-1.11-1.3.noarch.rpm"
RPM_HASH = "f33b4bf6752eea1143ae77d005ac351e6f27c3375cabd91b1113c0e2e468fe23b3694bcbfff6e6e359ceefdc19a76d0a532f389ea8acf681d8e8c6677674b404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pypandoc \
python310-pypandoc \
python3dist-pypandoc"

RDEPENDS:${PN} += "pandoc \
python-abi \
python310-pip \
python310-wheel"

inherit rpm
