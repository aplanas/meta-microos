SUMMARY = "Websocket handler for the gevent pywsgi server, a Python network library"
DESCRIPTION = "Websocket handler for the gevent pywsgi server, a Python network library"
LICENSE = "Apache-2.0"

PV = "0.10.1"

RPM_NAME = "python311-gevent-websocket-0.10.1-1.3.noarch.rpm"
RPM_HASH = "d7205a0ee5ae91a21ffa25b7b5c7fd5f0aa4dbea532e0d898ec2ae8a9608100081c48c84c984fa563050f9ed6e3c1d4c6fb8cef13a9c3745c395aeb6e75a9f82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(gevent-websocket) \
python311-gevent-websocket \
python3dist(gevent-websocket)"
RDEPENDS:${PN} += "python(abi) \
python311-gevent"

inherit rpm
