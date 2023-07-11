SUMMARY = "WebPush publication library"
DESCRIPTION = "WebPush publication library."
LICENSE = "MPL-2.0"

PV = "1.14.0"

RPM_NAME = "python311-pywebpush-1.14.0-3.1.noarch.rpm"
RPM_HASH = "fe3832076b5e5f7db87a6849e6bb99b02f6e8988c1a30c821f038a6c7c1e8bb32f56d3203829fd73016c7e4cd739ef4f40ba7f68a376d713bd89f72fdd198d32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pywebpush \
python3.11dist-pywebpush \
python311-pywebpush \
python3dist-pywebpush"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-cryptography \
python311-http-ece \
python311-py-vapid \
python311-requests \
update-alternatives"

inherit rpm
