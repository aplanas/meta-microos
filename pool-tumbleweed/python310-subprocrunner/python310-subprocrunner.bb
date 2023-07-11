SUMMARY = "A Python wrapper library for subprocess module"
DESCRIPTION = "A Python wrapper library for subprocess module."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-subprocrunner-2.0.0-2.5.noarch.rpm"
RPM_HASH = "79b4581d31503dcecf0ee40855e261e4aa751d0f441aac5bdb5a3edbf1c0f879e70567a114bb1e1d732ce306098c8bb893a67dd6f6e069c3b0e9a122dc6ac97a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-subprocrunner \
python310-subprocrunner \
python3dist-subprocrunner"

RDEPENDS:${PN} += "python-abi \
python310-loguru \
python310-mbstrdecoder \
python310-typepy"

inherit rpm
