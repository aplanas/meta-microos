SUMMARY = "FreePascal RAD IDE and Component Library"
DESCRIPTION = "Lazarus is an IDE to create (graphical and console) applications with \
Free Pascal, the (L)GPLed Pascal and Object Pascal compiler that runs on \
Windows, Linux, Mac OS X, FreeBSD and more. \
 \
Lazarus is the missing part of the puzzle that will allow you to develop \
programs for all of the above platforms in a Delphi-like environment. \
The IDE is a RAD tool that includes a form designer. \
 \
Unlike Java's 'write once, run anywhere' motto, Lazarus and Free Pascal \
strive for 'write once, compile anywhere'. Since the exact same compiler \
is available on all of the above platforms you don't need to do any recoding \
to produce identical products for different platforms. \
 \
In short, Lazarus is a free RAD tool for Free Pascal using its \
Lazarus Component Library (LCL)."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1"

PV = "2.2.6"

RPM_NAME = "lazarus-2.2.6-2.1.aarch64.rpm"
RPM_HASH = "2b8755cb52c61f700b62b1be8da0b64c2b94b69ebfc56b7e8117670d8a77cea05a912068c3d6e1bcfd86770887ba8ae524a832204e8f59d3a0e43c631edf8029"

RPROVIDES:${PN} += "lazarus"

RDEPENDS:${PN} += "binutils \
desktop-file-utils \
fpc \
fpc-src \
gcc \
gdb \
lazarus-ide \
lazarus-lcl \
lazarus-lcl-gtk2 \
lazarus-lcl-nogui \
lazarus-tools \
make \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-2.0 \
shared-mime-info"

inherit rpm
