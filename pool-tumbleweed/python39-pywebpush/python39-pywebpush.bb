SUMMARY = "WebPush publication library"
DESCRIPTION = "WebPush publication library."
LICENSE = "MPL-2.0"

PV = "1.14.0"

RPM_NAME = "python39-pywebpush-1.14.0-3.1.noarch.rpm"
RPM_HASH = "ab3bdaaf34d3df1f76f0ab073812efa3e0e65c97d7c60b46cf74eb906dbc31b7e31498bd066a44cf6c42c3d1e96b698c2a29fa84dabb81d3b5db98b649587ef8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pywebpush \
python39-pywebpush \
python3dist-pywebpush"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-cryptography \
python39-http-ece \
python39-py-vapid \
python39-requests \
update-alternatives"

inherit rpm
