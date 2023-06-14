SUMMARY = "Ghostview"
DESCRIPTION = "Ghostview offers an X11 GUI for viewing PostScript files. This is an \
X11 interface to ghostscript."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ghostview-1.5-444.19.aarch64.rpm"
RPM_HASH = "1316754655ec88ab1592c3b0e076e002dee9c46f4e258478c3839562891e151c5385e706a0702c107c07ca5765441d488d1f503e9d95c89659544a1746993da1"

RPROVIDES:${PN} += "config-ghostview \
ghostview \
ghstview \
gsview"

RDEPENDS:${PN} += "ghostscript-x11 \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
