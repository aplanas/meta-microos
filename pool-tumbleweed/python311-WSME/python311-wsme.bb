SUMMARY = "Web Services Made Easy"
DESCRIPTION = "Web Service Made Easy (WSME) is a way to implement webservices \
in Python web applications. \
It is originally a rewrite of TGWebServices \
with focus on extensibility, framework-independence and improved type handling."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python311-WSME-0.11.0-2.8.noarch.rpm"
RPM_HASH = "7b8ca54e778a599478e953459fdefec78ec829cddafc21737e0c89a396199b496f4a69f6114fa918f4db3ba3fa10043373f1884060f6375c3c901cc9bf342e39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-WSME \
python3.11dist-wsme \
python311-WSME \
python3dist-wsme"

RDEPENDS:${PN} += "python-abi \
python311-WebOb \
python311-netaddr \
python311-pytz \
python311-simplegeneric"

inherit rpm
