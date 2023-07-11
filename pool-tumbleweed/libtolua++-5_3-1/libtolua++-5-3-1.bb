SUMMARY = "Runtime libraries for tolua++"
DESCRIPTION = "This package provides shared libraries for tolua++."
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "libtolua++-5_3-1-1.0.93-10.3.aarch64.rpm"
RPM_HASH = "295667ddba0d33e96caba5d377695462689d1fbd03f1678ee39ba4e3633d9d1bbedbf885def9c2d1167c824de212269bc732be87c9d8720d3f4542656e92d134"

RPROVIDES:${PN} += "libtolua++-5-3-1 \
libtolua++-5.3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.3.so.5 \
libm.so.6"

inherit rpm
