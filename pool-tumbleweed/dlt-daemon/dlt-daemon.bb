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

RPM_NAME = "dlt-daemon-2.18.8-4.6.aarch64.rpm"
RPM_HASH = "e497d014c4fac161c89a07696979713c23657ea1756871de1e303a917ad9548b9fb50624640947a6f9c7f59a103f17d74c46816438156a6d145bdb498c10c985"

RPROVIDES:${PN} += "config-dlt-daemon \
dlt-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
shadow"

inherit rpm
