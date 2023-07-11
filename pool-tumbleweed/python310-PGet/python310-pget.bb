SUMMARY = "Download tool using chunks"
DESCRIPTION = "A tool and library to save large files by creating multiple connections."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python310-PGet-0.5.1-1.11.noarch.rpm"
RPM_HASH = "c84c30dc3b52d50ff11d465b4056d1f6083c8eb16fe7bfe9d22d41036af758a53d7b95404562826a434330ad47403f4eb52b839cf48be4ab5bb7b08491d82555"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pget \
python310-PGet \
python3dist-pget"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-requests \
update-alternatives"

inherit rpm
