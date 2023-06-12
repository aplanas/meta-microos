SUMMARY = "Development files for libtaginfo"
DESCRIPTION = "The libtaglib development package includes the header files, libraries, \
configuration files and development tools necessary for compiling and \
linking application which will use libtaginfo."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.1"

RPM_NAME = "libtaginfo-devel-0.2.1-2.4.aarch64.rpm"
RPM_HASH = "0349012193ba9ebcdcb648bf6d61d545d9b5c8a3b52c01fc39bd55ee08430e26ccecad3f1a182f04a452ae6bc0512465cb1cf932a928dba0ebcf3e61f902cfcb"

RPROVIDES:${PN} += "libtaginfo-devel \
libtaginfo-devel(aarch-64) \
pkgconfig(libtaginfo) \
pkgconfig(libtaginfo_c)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtaginfo1 \
libtaginfo_c0 \
pkgconfig(libtaginfo)"

inherit rpm
