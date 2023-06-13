SUMMARY = "Web Services Made Easy"
DESCRIPTION = "Web Service Made Easy (WSME) is a way to implement webservices \
in Python web applications. \
It is originally a rewrite of TGWebServices \
with focus on extensibility, framework-independence and improved type handling."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python310-WSME-0.11.0-2.6.noarch.rpm"
RPM_HASH = "70676b1f8b4f1b1029a25e1b4443737a9b0136cd31f5c364d61f5a16497f6b233b3f9e72187499328a024ebf5fc7ad3758ff171686b3e04c67824f43985c3545"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-WSME \
python3.10dist(wsme) \
python310-WSME \
python3dist(wsme)"

RDEPENDS:${PN} += "python(abi) \
python310-WebOb \
python310-netaddr \
python310-pytz \
python310-simplegeneric"

inherit rpm
