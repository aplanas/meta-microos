SUMMARY = "WebPush publication library"
DESCRIPTION = "WebPush publication library."
LICENSE = "MPL-2.0"

PV = "1.14.0"

RPM_NAME = "python310-pywebpush-1.14.0-3.1.noarch.rpm"
RPM_HASH = "f6568e752fbb46373d444abfea67b4e0177ca8ea020a60659399cd82a41f8ac98e6c12f3f04b6383ddfa84814cf1281b9b616688a45399416bb4439e21f5a93b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pywebpush \
python310-pywebpush \
python3dist-pywebpush"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-cryptography \
python310-http-ece \
python310-py-vapid \
python310-requests \
update-alternatives"

inherit rpm
