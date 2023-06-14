SUMMARY = "Utility to list interned atoms defined on an X11 server"
DESCRIPTION = "xlsatoms lists the interned atoms defined on an X11 server."
LICENSE = "X11"

PV = "1.1.4"

RPM_NAME = "xlsatoms-1.1.4-1.2.aarch64.rpm"
RPM_HASH = "90b5a84b9dac46a43e8c4d657bd6847bd201ce1f9701ccdbd355cb66243455a9fda5ccaa7d59917115fd0e4ce062bfde9b7980830b0c43de05af11d43fdd9beb"

RPROVIDES:${PN} += "xlsatoms"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
