SUMMARY = "A logging module for Python"
DESCRIPTION = "* Logs to console and/or file. \
* Pretty formatting, including level-specific colors in the console. \
* Robust against str/bytes encoding problems, works with all kinds of character encodings and special characters. \
* Heavily inspired by the Tornado web framework."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-logzero-1.7.0-3.10.noarch.rpm"
RPM_HASH = "f56b20ad635413f9a99239204e06086619c33f004ac33faf91c20bc915dc22b56d6aeb2d5fea1549381b80eed6e84e02bff008a63c2cf372a11e3fb3b24f08b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-logzero \
python3.11dist-logzero \
python311-logzero \
python3dist-logzero"

RDEPENDS:${PN} += "python-abi"

inherit rpm
