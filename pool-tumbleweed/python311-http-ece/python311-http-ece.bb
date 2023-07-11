SUMMARY = "Encrypted Content Encoding for HTTP"
DESCRIPTION = "Encrypted Content Encoding for HTTP."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-http-ece-1.1.0-4.4.noarch.rpm"
RPM_HASH = "a0194e059026c8390a33bfc7070243fd5d63acff541974cc4ba79ce75574e3e64018cada807bf5ef755208a66bb6ff57bfa2b57e2317106cd1fdd1e0f2273647"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-http-ece \
python3.11dist-http-ece \
python311-http-ece \
python3dist-http-ece"

RDEPENDS:${PN} += "python-abi \
python311-cryptography"

inherit rpm
