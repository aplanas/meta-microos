SUMMARY = "Web Services Made Easy"
DESCRIPTION = "Web Service Made Easy (WSME) is a way to implement webservices \
in Python web applications. \
It is originally a rewrite of TGWebServices \
with focus on extensibility, framework-independence and improved type handling."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python39-WSME-0.11.0-2.8.noarch.rpm"
RPM_HASH = "80ef802f831a842c6b2060fec5d471ab008252fee929a108ebd7f6dab2a43efc3714a0564dded5a43dd5b0ba93cd87f992a3fec48169751f91cb5f8838524037"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wsme \
python39-WSME \
python3dist-wsme"

RDEPENDS:${PN} += "python-abi \
python39-WebOb \
python39-netaddr \
python39-pytz \
python39-simplegeneric"

inherit rpm
