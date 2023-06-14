SUMMARY = "MATE disk usage analyser"
DESCRIPTION = "This is the MATE Disk Usage Analyzer as shipped with the MATE utilities. \
mate-disk-usage-analyzer is able to scan either specific directories or \
the wholefilesystem, in order to give the user a graphical tree representation \
including each directory size or percentage in the branch. \
It also auto-detects in real-time any change made to your home \
directory as far as any mounted/unmounted device."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-disk-usage-analyzer-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "ac73b730461a22cc4115a7bf6438b60565d53f869d26c31a34b1650ab18a99a74e2f6f9122dab4f95ba00afb5989808d26d68fc38850ca6cfcc90b7b837a0c23"

RPROVIDES:${PN} += "mate-disk-usage-analyzer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtop-2.0.so.11 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
