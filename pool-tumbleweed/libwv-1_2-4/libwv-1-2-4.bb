SUMMARY = "Library for importing Microsoft Word documents"
DESCRIPTION = "libwv can parse the Microsoft Word 8 binary file format (Office97)."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.9"

RPM_NAME = "libwv-1_2-4-1.2.9-2.10.aarch64.rpm"
RPM_HASH = "f04b9d3dacfee50447c71559a39587beb8881cfdaff44f3e7953c5108729bd1b98c9481c1e1ca000e8dd685b48c01a72b8e56dc7325228463e2ab6e3f936b0da"

RPROVIDES:${PN} += "libwv-1-2-4 \
libwv-1.2.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114 \
libxml2.so.2 \
libz.so.1"

inherit rpm
