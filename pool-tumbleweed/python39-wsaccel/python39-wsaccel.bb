SUMMARY = "Accelerator for ws4py and AutobahnPython"
DESCRIPTION = "WSAccell is WebSocket accelerator for `AutobahnPython <http://autobahn.ws/python>`_, \
`ws4py <https://github.com/Lawouach/WebSocket-for-Python>`_ and \
`Tornado <http://www.tornadoweb.org/>`_."
LICENSE = "Apache-2.0"

PV = "0.6.4"

RPM_NAME = "python39-wsaccel-0.6.4-1.6.aarch64.rpm"
RPM_HASH = "1bc4389df68126faf1790966d35e289a1530473c243d7864907ba3fc86cbc3ca2e9b5cd92f6cf0aa18864f9c80e1178374915eaa8575b3dbdbeb2e96bff64d42"

RPROVIDES:${PN} += "python3.9dist-wsaccel \
python39-wsaccel \
python3dist-wsaccel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
