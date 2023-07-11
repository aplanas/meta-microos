SUMMARY = "Websocket handler for the gevent pywsgi server, a Python network library"
DESCRIPTION = "Websocket handler for the gevent pywsgi server, a Python network library"
LICENSE = "Apache-2.0"

PV = "0.10.1"

RPM_NAME = "python39-gevent-websocket-0.10.1-1.4.noarch.rpm"
RPM_HASH = "c6a759cedcb9acc3b37652ff3968d961eecc748ecd46611fff16fcb528c2dfa7aa257b1468d070b3318458b5ca291d1afbf5b0be5be4731e3a4d719760382c03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gevent-websocket \
python39-gevent-websocket \
python3dist-gevent-websocket"

RDEPENDS:${PN} += "python-abi \
python39-gevent"

inherit rpm
