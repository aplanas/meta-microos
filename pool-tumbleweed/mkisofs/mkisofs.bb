SUMMARY = "A program to generate an ISO-9660/Joliet/HFS/UDF hybrid filesystem"
DESCRIPTION = "mkisofs is a pre-mastering program to generate filesystems following \
the ISO-9660 specification. It supports the Joliet, Rock Ridge and \
Apple extensions, as well as the creation of HFS/ISO-9660 and \
UDF/ISO-9660 hybrid filesystem images (images that can be mounted \
with either filesystem driver)."
LICENSE = "GPL-2.0-only"

PV = "3.02~a10"

RPM_NAME = "mkisofs-3.02~a10-47.3.aarch64.rpm"
RPM_HASH = "7ab7cc513bf626f97886d4cb0604c14cf1c49e8d6778dd7329c0ec916d3ceef7975634b2041939b1a64e250b258a16a48d697fc1fca87370a6019a888029d071"

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
