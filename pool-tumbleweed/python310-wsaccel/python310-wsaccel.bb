SUMMARY = "Accelerator for ws4py and AutobahnPython"
DESCRIPTION = "WSAccell is WebSocket accelerator for `AutobahnPython <http://autobahn.ws/python>`_, \
`ws4py <https://github.com/Lawouach/WebSocket-for-Python>`_ and \
`Tornado <http://www.tornadoweb.org/>`_."
LICENSE = "Apache-2.0"

PV = "0.6.4"

RPM_NAME = "python310-wsaccel-0.6.4-1.6.aarch64.rpm"
RPM_HASH = "2ab6de335b335a3ab64eb1588803c2580d051dba5e678c97e91c81c3a1b19fde465cbe8d29cd2bbad2ff071c5b712d881b7377b0ad7ef4150c419065be6702e3"

RPROVIDES:${PN} += "python3.10dist-wsaccel \
python310-wsaccel \
python3dist-wsaccel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
