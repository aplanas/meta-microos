SUMMARY = "Concurrent logging handler"
DESCRIPTION = "This module provides an additional log handler for Python's \
standard logging package (PEP 282). This handler will write log \
events to log file which is rotated when the log file reaches \
a certain size. Multiple processes can safely write to the same \
log file concurrently."
LICENSE = "Apache-2.0"

PV = "0.9.19"

RPM_NAME = "python310-concurrentloghandler-0.9.19-2.8.noarch.rpm"
RPM_HASH = "4756509a01bf677db55b292020cc6e3e2d0ed1df9d035f212a0b74521bb9eeec8533631df7823b4369dd4d7e0af9326b4358860e6f690f777ae5149474002ac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-concurrentloghandler \
python3.10dist-concurrent-log-handler \
python310-concurrentloghandler \
python3dist-concurrent-log-handler"

RDEPENDS:${PN} += "python-abi"

inherit rpm
