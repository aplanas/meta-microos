SUMMARY = "Retry Decorator"
DESCRIPTION = "Decorator to support retry when an exception occurs."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python310-retry_decorator-1.1.1-1.15.noarch.rpm"
RPM_HASH = "07aeeae71d30f67390b7a44be708d42a9910f799ee8c89ff1f0c2badbfbcf32df2b0457db21191e7e0f4b1cd7836ec13e06752bd060e1432aafdad9ff9cb2544"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-retry-decorator \
python310-retry-decorator \
python3dist-retry-decorator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
