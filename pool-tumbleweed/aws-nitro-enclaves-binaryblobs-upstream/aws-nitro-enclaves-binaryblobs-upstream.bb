SUMMARY = "Upstream kernel binary for AWS Nitro Enclaves"
DESCRIPTION = "This package contains a kernel binary and a helper binary, which is \
used by the nitro-cli build-enclave command to generate a Enclave \
Image File."
LICENSE = "Apache-2.0"

PV = "1.2.2~git0.4ccc639"

RPM_NAME = "aws-nitro-enclaves-binaryblobs-upstream-1.2.2~git0.4ccc639-1.3.aarch64.rpm"
RPM_HASH = "9dd5f5182e3310b56ddbc215563027ff41226727117e5c7a5c53cb0f10bd57d424ca1481517a612affe8667bc1476040838d25ae568a8cb53b52454812bf7fdf"

RPROVIDES:${PN} += "aws-nitro-enclaves-binaryblobs \
aws-nitro-enclaves-binaryblobs-upstream"

RDEPENDS:${PN} += "rtld-GNU-HASH"

inherit rpm
