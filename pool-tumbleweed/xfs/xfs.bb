SUMMARY = "X font server"
DESCRIPTION = "xfs is the X Window System font server. It supplies fonts to X Window \
System display servers."
LICENSE = "HPND"

PV = "1.2.1"

RPM_NAME = "xfs-1.2.1-2.5.aarch64.rpm"
RPM_HASH = "72eedbcd83a7da79088063e083ab9ed124410b5a2b76f06bc1079b5f96de1499bb6c141dfe429585d34e8b3dd466ab42cd403e6e475e5f98b2fac605fd91b4ec"

RPROVIDES:${PN} += "xfs"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libXfont2.so.2 \
libc.so.6"

inherit rpm
