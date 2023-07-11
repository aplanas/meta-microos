SUMMARY = "Python extension for the tempfile module"
DESCRIPTION = "A small Python extension for the tempfile module."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python39-volatile-2.1.0-1.13.noarch.rpm"
RPM_HASH = "d297dff8aa4669a44c986b0bb291556dc62ebe0f6d799b62dc379dadc548663d4e896846af58215934600ff25144b6c52c69a90f1a4124a265852ec559b6578a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-volatile \
python39-volatile \
python3dist-volatile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
