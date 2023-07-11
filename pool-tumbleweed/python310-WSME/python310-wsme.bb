SUMMARY = "Web Services Made Easy"
DESCRIPTION = "Web Service Made Easy (WSME) is a way to implement webservices \
in Python web applications. \
It is originally a rewrite of TGWebServices \
with focus on extensibility, framework-independence and improved type handling."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python310-WSME-0.11.0-2.8.noarch.rpm"
RPM_HASH = "bdc96831fa731ff20888ad40f9be3b29820d194cbc2ab8899ae6a9158a7dccc5d938d2f54a2d4f09aa1fe671adff85651d7cbc006109a1e45f0bd8a297d236bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wsme \
python310-WSME \
python3dist-wsme"

RDEPENDS:${PN} += "python-abi \
python310-WebOb \
python310-netaddr \
python310-pytz \
python310-simplegeneric"

inherit rpm
