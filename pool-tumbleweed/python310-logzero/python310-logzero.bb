SUMMARY = "A logging module for Python"
DESCRIPTION = "* Logs to console and/or file. \
* Pretty formatting, including level-specific colors in the console. \
* Robust against str/bytes encoding problems, works with all kinds of character encodings and special characters. \
* Heavily inspired by the Tornado web framework."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-logzero-1.7.0-3.10.noarch.rpm"
RPM_HASH = "30572393666c5983065205d83f4cb5a6c5e3458436f101f059c06992024b10000b92f4ecdd4d6679113389016d8a9940510f9b0f55e626bfdd1c13ed6bc4f635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-logzero \
python310-logzero \
python3dist-logzero"

RDEPENDS:${PN} += "python-abi"

inherit rpm
