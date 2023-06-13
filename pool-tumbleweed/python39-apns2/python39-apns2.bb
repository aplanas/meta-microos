SUMMARY = "Python library for the HTTP/2 Apple Push Notification Service"
DESCRIPTION = "A python library for interacting with the Apple Push Notification Service \
via HTTP/2 protocol."
LICENSE = "MIT"

PV = "0.7.2"

RPM_NAME = "python39-apns2-0.7.2-2.3.noarch.rpm"
RPM_HASH = "a692b40fec77220aa7ef546e837458ae5395e15bba4ffa9a36c0fbc3dae8a8fb6cbf37c09fed3fa1c7693d6f4e9b8dee6a3c265e91455667608436039cc70960"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(apns2) \
python39-apns2 \
python3dist(apns2)"

RDEPENDS:${PN} += "python(abi) \
python39-PyJWT \
python39-cryptography \
python39-h2 \
python39-httpx"

inherit rpm
