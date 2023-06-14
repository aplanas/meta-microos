SUMMARY = "Hex/bin format conversion package"
DESCRIPTION = "The srecord package is a collection of powerful tools for manipulating EPROM \
load files. It reads and writes numerous EPROM file formats, and can perform \
many different manipulations."
LICENSE = "GPL-3.0+"

PV = "1.64"

RPM_NAME = "srecord-1.64-4.32.aarch64.rpm"
RPM_HASH = "abf6aa7f8a4d7f9f60d2d64809137b6696fe014d574199a61632483ad0b720f87e05947707c79f85266e51443702aca976eb24ae73cef10cc0b5e7c6c958236a"

RPROVIDES:${PN} += "srecord"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsrecord.so.0 \
libstdc++.so.6"

inherit rpm
