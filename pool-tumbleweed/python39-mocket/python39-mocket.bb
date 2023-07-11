SUMMARY = "Python socket mock framework"
DESCRIPTION = "Socket Mock Framework - for all kinds of socket animals, web-clients \
included, with gevent/asyncio/SSL support."
LICENSE = "BSD-3-Clause"

PV = "3.11.1"

RPM_NAME = "python39-mocket-3.11.1-1.2.noarch.rpm"
RPM_HASH = "0e22ebff9e17e52ccf65670e981fb370e04475cc22cc2f33b5c65d300505079e4d3b0c002181e47a622703c46afcd4f8227035f54b7793b9c47bc8632cba237e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mocket \
python39-mocket \
python3dist-mocket"

RDEPENDS:${PN} += "python-abi \
python39-decorator \
python39-httptools \
python39-python-magic \
python39-urllib3"

inherit rpm
