SUMMARY = "Python logging component with a simple interface"
DESCRIPTION = "Python logging component providing a single object \
which dispatches log messages to configured handlers."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-loguru-0.7.0-2.3.noarch.rpm"
RPM_HASH = "7d9d5ebf9818c89401d3d140e7e91ace5281949812a497ae94868726bb1b7046efb4e70ea18ee7c75b170c0f991ba2a0d20066fac63d5e6eaa43648f29ac50ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-loguru \
python310-loguru \
python3dist-loguru"

RDEPENDS:${PN} += "python-abi"

inherit rpm
