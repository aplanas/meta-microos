SUMMARY = "Websocket handler for the gevent pywsgi server, a Python network library"
DESCRIPTION = "Websocket handler for the gevent pywsgi server, a Python network library"
LICENSE = "Apache-2.0"

PV = "0.10.1"

RPM_NAME = "python311-gevent-websocket-0.10.1-1.4.noarch.rpm"
RPM_HASH = "33f2ea7f61e01df66ec1400e7524157b9d542762023dac2f36b3855f0d2c5a6def010a759158f4918da7af513bc5fa149acbca72345115a25e9d99dc81c40ebb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gevent-websocket \
python3.11dist-gevent-websocket \
python311-gevent-websocket \
python3dist-gevent-websocket"

RDEPENDS:${PN} += "python-abi \
python311-gevent"

inherit rpm
