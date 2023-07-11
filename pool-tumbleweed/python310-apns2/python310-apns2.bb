SUMMARY = "Python library for the HTTP/2 Apple Push Notification Service"
DESCRIPTION = "A python library for interacting with the Apple Push Notification Service \
via HTTP/2 protocol."
LICENSE = "MIT"

PV = "0.7.2"

RPM_NAME = "python310-apns2-0.7.2-2.5.noarch.rpm"
RPM_HASH = "428d400e0fbfc1de08241cf4151678dd51cc6ebb7d39835a6e96a3b421f5a4f7278a01bb9d93f706eb4370f5028da08293354dc9fa54679bdacb4b9fbcd7521c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-apns2 \
python310-apns2 \
python3dist-apns2"

RDEPENDS:${PN} += "python-abi \
python310-PyJWT \
python310-cryptography \
python310-h2 \
python310-httpx"

inherit rpm
