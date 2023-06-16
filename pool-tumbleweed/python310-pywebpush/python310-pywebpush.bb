SUMMARY = "WebPush publication library"
DESCRIPTION = "WebPush publication library."
LICENSE = "MPL-2.0"

PV = "1.14.0"

RPM_NAME = "python310-pywebpush-1.14.0-2.6.noarch.rpm"
RPM_HASH = "6b89076a9d898eb13d5d014db425536c6abbe96d688662304f0595fa0dd29ceeec477fd4f22a86137295e3b42494ecf9da679224cc66f32937a8fb637b34a496"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pywebpush \
python3.10dist-pywebpush \
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
