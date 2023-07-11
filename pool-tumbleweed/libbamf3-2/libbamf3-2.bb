SUMMARY = "Window matching library"
DESCRIPTION = "bamf matches application windows to desktop files. \
 \
This package contains libraries to be used by applications."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "0.5.6"

RPM_NAME = "libbamf3-2-0.5.6-1.5.aarch64.rpm"
RPM_HASH = "2099090864aac89bbb978d477a0a464aba8415a509ae788c49245c2c42dd08599693dae50437423e709c5f315b5a8aac93676075d0a0ddf3eace1a565012e5a9"

RPROVIDES:${PN} += "libbamf3-2 \
libbamf3.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
