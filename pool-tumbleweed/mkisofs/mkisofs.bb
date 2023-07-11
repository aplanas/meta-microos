SUMMARY = "A program to generate an ISO-9660/Joliet/HFS/UDF hybrid filesystem"
DESCRIPTION = "mkisofs is a pre-mastering program to generate filesystems following \
the ISO-9660 specification. It supports the Joliet, Rock Ridge and \
Apple extensions, as well as the creation of HFS/ISO-9660 and \
UDF/ISO-9660 hybrid filesystem images (images that can be mounted \
with either filesystem driver)."
LICENSE = "GPL-2.0-only"

PV = "3.02~a10"

RPM_NAME = "mkisofs-3.02~a10-47.4.aarch64.rpm"
RPM_HASH = "7a467f2805225bd31aedd75e7b00c870ab15f8c13da4ba5f99ab52a6e2113996bed037474d77f202403055300ce76fb574c8e1928711d3e557b05e54a469044a"

RPROVIDES:${PN} += "mkisofs"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdrdeflt.so.1.0 \
libfile.so.1.0 \
libfind.so.4.0 \
librscg.so.1.0 \
libscg.so.1.0 \
libscgcmd.so.1.0 \
libschily.so.2.0 \
zisofs-tools"

inherit rpm
