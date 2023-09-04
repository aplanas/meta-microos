SUMMARY = "File system general utilities"
DESCRIPTION = "Pattern matching and various utilities for file systems paths."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python310-pathtools-0.1.2-16.1.noarch.rpm"
RPM_HASH = "08898085fffa4c063ca699ba2a88bf9622708b5b5c7175263a81bd8e123befd405c8cdb5791fc3a30ed600151d222452cd321ec6ea97844ce8f49d70f38f1f45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pathtools \
python310-pathtools \
python3dist-pathtools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
