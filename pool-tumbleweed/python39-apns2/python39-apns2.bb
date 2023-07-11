SUMMARY = "Python library for the HTTP/2 Apple Push Notification Service"
DESCRIPTION = "A python library for interacting with the Apple Push Notification Service \
via HTTP/2 protocol."
LICENSE = "MIT"

PV = "0.7.2"

RPM_NAME = "python39-apns2-0.7.2-2.5.noarch.rpm"
RPM_HASH = "23714299f29461e138083b9aa1c0ce6260d1955170873cdd8de951c8b500982cf944eb0287eeed7b6371aba013cee3750a27fb29cda45d82b2bfd236a9660e86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-apns2 \
python39-apns2 \
python3dist-apns2"

RDEPENDS:${PN} += "python-abi \
python39-PyJWT \
python39-cryptography \
python39-h2 \
python39-httpx"

inherit rpm
