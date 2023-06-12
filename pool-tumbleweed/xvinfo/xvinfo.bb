SUMMARY = "Utility to print X-Video extension adaptor information"
DESCRIPTION = "xvinfo prints out the capabilities of any video adaptors associated \
with the display that are accessible through the X-Video extension."
LICENSE = "X11"

PV = "1.1.5"

RPM_NAME = "xvinfo-1.1.5-1.2.aarch64.rpm"
RPM_HASH = "ede95a703d8f2b6a36026ce00dbdeda414bf5efbff89bd06d0bd3b9d4ae654347e7040dc38f760ea9cf7b6838e3f43ba9ed454547250f5bc0da1181aaf9bdff9"

RPROVIDES:${PN} += "xvinfo \
xvinfo(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXv.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
