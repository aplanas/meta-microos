SUMMARY = "Upstream kernel binary for AWS Nitro Enclaves"
DESCRIPTION = "This package contains a kernel binary and a helper binary, which is \
used by the nitro-cli build-enclave command to generate a Enclave \
Image File."
LICENSE = "Apache-2.0"

PV = "1.2.2~git0.4ccc639"

RPM_NAME = "aws-nitro-enclaves-binaryblobs-upstream-1.2.2~git0.4ccc639-1.5.aarch64.rpm"
RPM_HASH = "de088a5144600ac01195d02060e9d07a4930a734885f28200c80614412071b2a0afe6276ea50c72a10cdde1772181256c5eebf0c63b9930fc4178cecf1a559a2"

RPROVIDES:${PN} += "aws-nitro-enclaves-binaryblobs \
aws-nitro-enclaves-binaryblobs-upstream"

RDEPENDS:${PN} += "rtld-GNU-HASH"

inherit rpm
