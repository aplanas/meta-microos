SUMMARY = "Download tool using chunks"
DESCRIPTION = "A tool and library to save large files by creating multiple connections."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python310-PGet-0.5.1-1.9.noarch.rpm"
RPM_HASH = "c7afa1230512b1a7d02f0a1d6053a168675b5a48e4b7ba62ae1b4fcc85222dd59eac21a75bd72e674dd85746f104707a65b836ee42a4b1fa2fa80a56986ae816"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PGet \
python3.10dist-pget \
python310-PGet \
python3dist-pget"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-requests \
update-alternatives"

inherit rpm
