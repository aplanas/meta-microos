SUMMARY = "Python library for the HTTP/2 Apple Push Notification Service"
DESCRIPTION = "A python library for interacting with the Apple Push Notification Service \
via HTTP/2 protocol."
LICENSE = "MIT"

PV = "0.7.2"

RPM_NAME = "python311-apns2-0.7.2-2.5.noarch.rpm"
RPM_HASH = "d5537be5e4f8138563fe4feb390c964e8ee786707064dee0f2260a5c5479b2d648a361ed9090421110b74f0a9365e7b7abecf67c18c06db69d6dfbdc31814f5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apns2 \
python3.11dist-apns2 \
python311-apns2 \
python3dist-apns2"

RDEPENDS:${PN} += "python-abi \
python311-PyJWT \
python311-cryptography \
python311-h2 \
python311-httpx"

inherit rpm
