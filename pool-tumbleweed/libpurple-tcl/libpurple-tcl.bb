SUMMARY = "TCL Plugin Support for Pidgin"
DESCRIPTION = "TCL plugin loader for Pidgin. This package will allow you to write \
or use Pidgin plugins written in the TCL programming language."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "libpurple-tcl-2.14.12-1.3.aarch64.rpm"
RPM_HASH = "c630c7b9a5c8ef7f3840f184073c9848b091db5933f933eb3810d104949dff384b94f6ac80393a3ed420373b2ebc68ef5fb98574f76db8c57ff3a0068edd3661"

RPROVIDES:${PN} += "libpurple-tcl \
libpurple-tcl(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libpurple \
libtcl8.6.so()(64bit) \
libtk8.6.so()(64bit)"

inherit rpm
