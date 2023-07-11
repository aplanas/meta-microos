SUMMARY = "Concurrent logging handler"
DESCRIPTION = "This module provides an additional log handler for Python's \
standard logging package (PEP 282). This handler will write log \
events to log file which is rotated when the log file reaches \
a certain size. Multiple processes can safely write to the same \
log file concurrently."
LICENSE = "Apache-2.0"

PV = "0.9.19"

RPM_NAME = "python310-concurrentloghandler-0.9.19-2.10.noarch.rpm"
RPM_HASH = "a702f6a319896d2735ed3b33db5393368176b9a860027c35a7278a1f2ee472ae19f3c42c64235411fc5a0a6e6b62643b05a586a3e57c786a9efc670fdc219b15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-concurrent-log-handler \
python310-concurrentloghandler \
python3dist-concurrent-log-handler"

RDEPENDS:${PN} += "python-abi"

inherit rpm
