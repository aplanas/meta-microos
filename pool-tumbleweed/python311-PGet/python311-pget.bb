SUMMARY = "Download tool using chunks"
DESCRIPTION = "A tool and library to save large files by creating multiple connections."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python311-PGet-0.5.1-1.11.noarch.rpm"
RPM_HASH = "fa21435a698bc10334e0a30d135ebf13ae0f67c775af891485f95ed5ef2e3654f58821eb7d882604b6fe8b1b28b839b71a86393bfa116657f289cf28c090b83a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PGet \
python3.11dist-pget \
python311-PGet \
python3dist-pget"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-requests \
update-alternatives"

inherit rpm
