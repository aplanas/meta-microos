SUMMARY = "Python time mocking"
DESCRIPTION = "A python library that helps users write deterministic tests for time sensitive and I/O intensive code."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python311-time-travel-1.1.2-3.5.noarch.rpm"
RPM_HASH = "b538381f2e8a79d4c4d9bd2b60c2c3647b5f8eef5f023ed65bf0e59264cc569ae132aa5b703f5e78924665cc7cb958f6de4f55d8cd7952137f7d71fcbfb0eb0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-time-travel \
python311-time-travel \
python3dist-time-travel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
