SUMMARY = "Library and tools for handling X-Face data"
DESCRIPTION = "The programs compface and uncompface convert 48x48x1 images to and from \
a compressed format.  The purpose of the programs is to allow the \
inclusion of face images within mail headers using the field name \
'X-face:'.  They make use of a library that allows the compression and \
decompression algorithms to be used in other programs, such as mail \
dispatchers and mail notification daemons."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "compface-1.5.2-158.27.aarch64.rpm"
RPM_HASH = "27a3b33615382981e54a26181f562c9ab3bbc83fd44a3356a713d411285572135c30f07cd11521441a2e59d8ddee57661cef72ecb92c6a0ffc5b963591228e0c"

RPROVIDES:${PN} += "compface \
compface(aarch-64) \
libcompface.so.1()(64bit)"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
