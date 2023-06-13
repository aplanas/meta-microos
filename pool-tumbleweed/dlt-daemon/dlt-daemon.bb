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

RPM_NAME = "dlt-daemon-2.18.8-4.4.aarch64.rpm"
RPM_HASH = "3a68e8c35399ff628ddaa3bc95933f70b05870f89b0662be55da3b183c67e8de43b62fdf8e19b1765d4fcc1971e374fd75b584e0a44910a27deb59b3051905e5"

RPROVIDES:${PN} += "config(dlt-daemon) \
dlt-daemon \
dlt-daemon(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
shadow"

inherit rpm
