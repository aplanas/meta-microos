SUMMARY = "Concurrent logging handler"
DESCRIPTION = "This module provides an additional log handler for Python's \
standard logging package (PEP 282). This handler will write log \
events to log file which is rotated when the log file reaches \
a certain size. Multiple processes can safely write to the same \
log file concurrently."
LICENSE = "Apache-2.0"

PV = "0.9.19"

RPM_NAME = "python311-concurrentloghandler-0.9.19-2.10.noarch.rpm"
RPM_HASH = "d778fe7f49fe37c488987a30f9487d4bb25846e51936a38c5365f974109bbc752a6d5609ce9af62bd077a3865f459036f3c227c26db5fbe28dcdcb599421cea5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-concurrentloghandler \
python3.11dist-concurrent-log-handler \
python311-concurrentloghandler \
python3dist-concurrent-log-handler"

RDEPENDS:${PN} += "python-abi"

inherit rpm
