SUMMARY = "Concurrent logging handler"
DESCRIPTION = "This module provides an additional log handler for Python's \
standard logging package (PEP 282). This handler will write log \
events to log file which is rotated when the log file reaches \
a certain size. Multiple processes can safely write to the same \
log file concurrently."
LICENSE = "Apache-2.0"

PV = "0.9.19"

RPM_NAME = "python311-concurrentloghandler-0.9.19-2.8.noarch.rpm"
RPM_HASH = "98747d4eaeaf683e06eadac95c0c29e2f63a749249aee7f562ea0780480d32cdd66b43d26145d8c31f7b81ec8fdd59cc6070ad7c419d1faec6442db798cff444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-concurrent-log-handler \
python311-concurrentloghandler \
python3dist-concurrent-log-handler"

RDEPENDS:${PN} += "python-abi"

inherit rpm
