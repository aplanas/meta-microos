SUMMARY = "Websocket handler for the gevent pywsgi server, a Python network library"
DESCRIPTION = "Websocket handler for the gevent pywsgi server, a Python network library"
LICENSE = "Apache-2.0"

PV = "0.10.1"

RPM_NAME = "python39-gevent-websocket-0.10.1-1.3.noarch.rpm"
RPM_HASH = "b5d25c8fb4f96cac3e1d07309a578c58cc2afc567cf497590c354a41c4ff255e37cd8c1baec1c4e5209ce2c8d18b23e44e5cda4c8781b074108c561564d79dc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(gevent-websocket) \
python39-gevent-websocket \
python3dist(gevent-websocket)"
RDEPENDS:${PN} += "python(abi) \
python39-gevent"

inherit rpm
