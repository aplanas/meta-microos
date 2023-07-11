SUMMARY = "Websocket handler for the gevent pywsgi server, a Python network library"
DESCRIPTION = "Websocket handler for the gevent pywsgi server, a Python network library"
LICENSE = "Apache-2.0"

PV = "0.10.1"

RPM_NAME = "python310-gevent-websocket-0.10.1-1.4.noarch.rpm"
RPM_HASH = "040e45c1b6a3422b81e7ce279e5ab1036593edb98dea783d3fc4a82cc11a00bf58738aad243acc45df1f6ab9b38b0060816d1ceae74d937076ec27add97d77e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gevent-websocket \
python310-gevent-websocket \
python3dist-gevent-websocket"

RDEPENDS:${PN} += "python-abi \
python310-gevent"

inherit rpm
