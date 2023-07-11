SUMMARY = "TCL Plugin Support for Pidgin"
DESCRIPTION = "TCL plugin loader for Pidgin. This package will allow you to write \
or use Pidgin plugins written in the TCL programming language."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "libpurple-tcl-2.14.12-1.4.aarch64.rpm"
RPM_HASH = "23bb8142a109164337d3ef282cf17b645a4018103437b8c448e278a3eaa5dded83ed3bf372a71d1e4e499d4abc8b665a96ef33534e76b3bbc1bb247f761475f6"

RPROVIDES:${PN} += "libpurple-tcl"

RDEPENDS:${PN} += "libc.so.6 \
libglib-2.0.so.0 \
libpurple \
libtcl8.6.so \
libtk8.6.so"

inherit rpm
