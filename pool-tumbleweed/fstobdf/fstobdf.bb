SUMMARY = "Program to read a font from an X font server"
DESCRIPTION = "The fstobdf program reads a font from a font server and prints a BDF \
file on the standard output that may be used to recreate the font. \
This is useful in testing servers, debugging font metrics, and \
reproducing lost BDF files."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "fstobdf-1.0.7-1.2.aarch64.rpm"
RPM_HASH = "4c5ee4d2945bbebdb30ce216d60007fa2ac09765a8e011f2fcb19774fbb7d8e2b0466a80d972fd9371e07ce06072a54f9a7eecff848288f28cd900f7d0806c4c"

RPROVIDES:${PN} += "fstobdf \
fstobdf(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libFS.so.6()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
