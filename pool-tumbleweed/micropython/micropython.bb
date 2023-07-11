SUMMARY = "Implementation of Python 3 with very low memory footprint"
DESCRIPTION = "A lean and efficient Python implementation for microcontrollers and constrained systems"
LICENSE = "MIT"

PV = "1.20.0"

RPM_NAME = "micropython-1.20.0-1.2.aarch64.rpm"
RPM_HASH = "1356ad9700cf61d170218ebbcaf37ae284584fdbff3c6a089cbb6978d4515c67b6ba8db6457d26782a848715d0559b32440812a4c55b7fa09d70c29c5517a57e"

RPROVIDES:${PN} += "micropython"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libm.so.6"

inherit rpm
