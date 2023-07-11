SUMMARY = "Concurrent logging handler"
DESCRIPTION = "This module provides an additional log handler for Python's \
standard logging package (PEP 282). This handler will write log \
events to log file which is rotated when the log file reaches \
a certain size. Multiple processes can safely write to the same \
log file concurrently."
LICENSE = "Apache-2.0"

PV = "0.9.19"

RPM_NAME = "python39-concurrentloghandler-0.9.19-2.10.noarch.rpm"
RPM_HASH = "541f7bfcf31f0c52887813a089a76858bc73c7f2db1f5a4eeb0defb0cccd7fe03318e3148df5cf130d5f03761b80dd78a76f555282304564d48ce3308fb70bdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-concurrent-log-handler \
python39-concurrentloghandler \
python3dist-concurrent-log-handler"

RDEPENDS:${PN} += "python-abi"

inherit rpm
