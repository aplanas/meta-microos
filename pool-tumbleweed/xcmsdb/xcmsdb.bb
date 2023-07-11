SUMMARY = "Device Color Characterization utility for X Color Management System"
DESCRIPTION = "xcmsdb is used to load, query, or remove Device Color Characterization \
data stored in properties on the root window of the screen as \
specified in section 7, Device Color Characterization, of the \
X11 Inter-Client Communication Conventions Manual (ICCCM)."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "xcmsdb-1.0.6-1.4.aarch64.rpm"
RPM_HASH = "79d99f8bfa069156b30b365f59142f212d8d5d6a59773a19fe8cfc08f365f021e756044c054c8c2897754bb288df7f815df94dedc19423e3d0400bf4cba2a1f8"

RPROVIDES:${PN} += "xcmsdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
