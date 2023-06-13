SUMMARY = "Main library for libmodulemd"
DESCRIPTION = "This package provides the main library for applications \
that use libmodulemd."
LICENSE = "MIT"

PV = "2.14.0"

RPM_NAME = "libmodulemd2-2.14.0-1.3.aarch64.rpm"
RPM_HASH = "bde97d8e29efcbacd30f87cdd80fb13a0975a4e8ee80d250251d2f90a30afddcccb1275ced33a28da828de2dec58eb0b98b231994953d4fec8a6856bcc13027f"

RPROVIDES:${PN} += "libmodulemd.so.2()(64bit) \
libmodulemd2 \
libmodulemd2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libmagic.so.1()(64bit) \
librpmio.so.9()(64bit) \
libyaml-0.so.2()(64bit)"

inherit rpm
