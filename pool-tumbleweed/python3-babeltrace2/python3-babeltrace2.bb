SUMMARY = "Python Bindings for babeltrace2"
DESCRIPTION = "This project provides trace read and write libraries, as well as a \
trace converter. A plugin can be created for any trace format to \
allow its conversion to/from another trace format. \
 \
Python Bindings for the babeltrace2 package."
LICENSE = "MIT & GPL-2.0-only"

PV = "2.0.4"

RPM_NAME = "python3-babeltrace2-2.0.4-1.11.aarch64.rpm"
RPM_HASH = "f47b02d93f4a752dd17419bff569cd685c3c0d2133444e256ed9054761e4d37e28d3b2ba68a996a80e40d33f12d1d885008b463fcdbddbee3329fdbd18db51f0"

RPROVIDES:${PN} += "python3-babeltrace2 \
python3.11dist-bt2 \
python3dist-bt2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbabeltrace2.so.0 \
libc.so.6 \
libglib-2.0.so.0 \
python-abi"

inherit rpm
