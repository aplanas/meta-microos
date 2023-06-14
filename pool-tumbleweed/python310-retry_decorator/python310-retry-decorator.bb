SUMMARY = "Retry Decorator"
DESCRIPTION = "Decorator to support retry when an exception occurs."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python310-retry_decorator-1.1.1-1.13.noarch.rpm"
RPM_HASH = "da28406757ff29d993132dc78fdea81aab445fdce1ee59f8ac7118130f94a32ecf95622a9cd4fe77bd8da636fc37d3699e66e74e3bcb53fb685ff82a203d67ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-retry-decorator \
python3.10dist-retry-decorator \
python310-retry-decorator \
python3dist-retry-decorator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
