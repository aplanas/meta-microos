SUMMARY = "Commands for Manipulating Extended Attributes"
DESCRIPTION = "A set of tools for manipulating extended attributes on file system \
objects, in particular getfattr(1) and setfattr(1). An attr(1) command \
is also provided, which is largely compatible with the SGI IRIX tool of \
the same name."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.5.1"

RPM_NAME = "attr-2.5.1-1.20.aarch64.rpm"
RPM_HASH = "048c9448894ed06ed3d31f2df941b5846238029da368c63bb0d728cf718471604cbd0ed808604421a3b25ac10811af8daaa56875f1a5d2290f23952a2b88a82d"

RPROVIDES:${PN} += "attr attr(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libattr.so.1()(64bit) libattr.so.1(ATTR_1.0)(64bit) libattr.so.1(ATTR_1.2)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
