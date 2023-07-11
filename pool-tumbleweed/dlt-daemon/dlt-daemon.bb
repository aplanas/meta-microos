SUMMARY = "DLT - Diagnostic Log and Trace"
DESCRIPTION = "This component provides a standardised log and trace interface, based on the \
standardised protocol specified in the AUTOSAR standard 4.0 DLT. \
This component can be used by GENIVI components and other applications as \
logging facility providing \
- the DLT shared library \
- the DLT daemon, including startup scripts \
- the DLT daemon adaptors \
- the DLT client console utilities \
- the DLT test applications"
LICENSE = "MPL-2.0-no-copyleft-exception"

PV = "2.18.8"

RPM_NAME = "dlt-daemon-2.18.8-4.5.aarch64.rpm"
RPM_HASH = "08f763db34485cd6a5dc6d70f2092d6b6de7a27906a02e15670db39f6ea1540a42733bbf539434b2f8d4bbaa193123cf800e4e3606249dedf1a8588dcccfc73c"

RPROVIDES:${PN} += "config-dlt-daemon \
dlt-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
shadow"

inherit rpm
