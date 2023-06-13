SUMMARY = "Device Color Characterization utility for X Color Management System"
DESCRIPTION = "xcmsdb is used to load, query, or remove Device Color Characterization \
data stored in properties on the root window of the screen as \
specified in section 7, Device Color Characterization, of the \
X11 Inter-Client Communication Conventions Manual (ICCCM)."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "xcmsdb-1.0.6-1.3.aarch64.rpm"
RPM_HASH = "c8bc56b235f5b04064ca4850829cb399248727c618c5730c6e013835d8fe660be5e887c4b0e486900138fc42af1b8733bdfd7711a2fb9c5b84768bfc7bf022d1"

RPROVIDES:${PN} += "xcmsdb \
xcmsdb(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
