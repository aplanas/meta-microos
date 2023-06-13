SUMMARY = "Websocket handler for the gevent pywsgi server, a Python network library"
DESCRIPTION = "Websocket handler for the gevent pywsgi server, a Python network library"
LICENSE = "Apache-2.0"

PV = "0.10.1"

RPM_NAME = "python310-gevent-websocket-0.10.1-1.3.noarch.rpm"
RPM_HASH = "22618c938a35c61b0d04e95b7bc40958f857c1e4c2866575bb18b9bbe31ba01cdea09716976ab43bb6c671b5485d38fae56a4bad5487b4e7f94d0933772c104e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gevent-websocket \
python3.10dist(gevent-websocket) \
python310-gevent-websocket \
python3dist(gevent-websocket)"

RDEPENDS:${PN} += "python(abi) \
python310-gevent"

inherit rpm
