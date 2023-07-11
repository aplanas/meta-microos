SUMMARY = "A logging module for Python"
DESCRIPTION = "* Logs to console and/or file. \
* Pretty formatting, including level-specific colors in the console. \
* Robust against str/bytes encoding problems, works with all kinds of character encodings and special characters. \
* Heavily inspired by the Tornado web framework."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-logzero-1.7.0-3.10.noarch.rpm"
RPM_HASH = "5307e1f1194f0f7994c72686009fddaf620ab082f4c8a82d9a0bcbd3309cf611177d4707556590565e7b68de53bb2f47393397ad168cc7a42a56b234aba58d03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-logzero \
python39-logzero \
python3dist-logzero"

RDEPENDS:${PN} += "python-abi"

inherit rpm
