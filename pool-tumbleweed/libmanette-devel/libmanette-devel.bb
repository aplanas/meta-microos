SUMMARY = "Development files for the libmanette library"
DESCRIPTION = "libmanette allows easy access to game controllers."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.6"

RPM_NAME = "libmanette-devel-0.2.6-2.11.aarch64.rpm"
RPM_HASH = "224e9c1da36f9e781861e2f5912beb239d3eefb50ab2e620c611b4215f5e22a73ffdbc58b8fbd6636973dfdf68f8e3297256cc4bb3cce0513b6c7519a3444518"

RPROVIDES:${PN} += "libmanette-devel \
pkgconfig-manette-0.2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmanette-0-2-0 \
libmanette-0.2.so.0 \
pkgconfig-glib-2.0"

inherit rpm
