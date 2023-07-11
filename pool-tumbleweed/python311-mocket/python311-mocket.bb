SUMMARY = "Python socket mock framework"
DESCRIPTION = "Socket Mock Framework - for all kinds of socket animals, web-clients \
included, with gevent/asyncio/SSL support."
LICENSE = "BSD-3-Clause"

PV = "3.11.1"

RPM_NAME = "python311-mocket-3.11.1-1.2.noarch.rpm"
RPM_HASH = "5ecd386fd950c2392bd647b3e27782f680257552ddcde304f83f45244e1e0286f6e5bee6a819dc26d4a72609e6b6e09f6556ee37a30dc6439d29accc0249878a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mocket \
python3.11dist-mocket \
python311-mocket \
python3dist-mocket"

RDEPENDS:${PN} += "python-abi \
python311-decorator \
python311-httptools \
python311-python-magic \
python311-urllib3"

inherit rpm
