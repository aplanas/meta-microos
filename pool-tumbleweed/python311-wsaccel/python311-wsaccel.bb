SUMMARY = "Accelerator for ws4py and AutobahnPython"
DESCRIPTION = "WSAccell is WebSocket accelerator for `AutobahnPython <http://autobahn.ws/python>`_, \
`ws4py <https://github.com/Lawouach/WebSocket-for-Python>`_ and \
`Tornado <http://www.tornadoweb.org/>`_."
LICENSE = "Apache-2.0"

PV = "0.6.4"

RPM_NAME = "python311-wsaccel-0.6.4-1.6.aarch64.rpm"
RPM_HASH = "ae2b547fe04dbed7fc8180cace3f71a2b499dcd7b52e18b8557b3c61bd81eda3d332bbc8d623bd68f2593886e73f8f6e07ca87ff7bc66f00229db8f3c91d1100"

RPROVIDES:${PN} += "python3-wsaccel \
python3.11dist-wsaccel \
python311-wsaccel \
python3dist-wsaccel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
