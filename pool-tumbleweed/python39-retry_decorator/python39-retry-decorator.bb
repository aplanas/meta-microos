SUMMARY = "Retry Decorator"
DESCRIPTION = "Decorator to support retry when an exception occurs."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-retry_decorator-1.1.1-1.15.noarch.rpm"
RPM_HASH = "4e64285ff1630992ea83c3bcadbc94e1d33f2a3d89c291787739b7b8fee98270053dde607267dc7fbc267d29fbbff20a52209b64fcffe33bde105ffc8c878f6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-retry-decorator \
python39-retry-decorator \
python3dist-retry-decorator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
