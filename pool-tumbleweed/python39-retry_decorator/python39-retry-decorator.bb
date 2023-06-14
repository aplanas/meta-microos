SUMMARY = "Retry Decorator"
DESCRIPTION = "Decorator to support retry when an exception occurs."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-retry_decorator-1.1.1-1.13.noarch.rpm"
RPM_HASH = "b892522fd68d3e0d9f0d6506a91a625c71bb18739ad15f0783cf792b0d47a71e9b2f02976bda2ea78a5dce55ea947d75fabfa7300db5f8d681d97239fe2110b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-retry-decorator \
python39-retry-decorator \
python3dist-retry-decorator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
