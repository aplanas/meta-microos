SUMMARY = "BSD function library"
DESCRIPTION = "A library that extends the GNU libc with some functions and macros from BSD, \
most notably the string functions strlcpy(3), strlcat(3) and the *BSD \
sys/queue.h and sys/tree.h APIs. \
 \
glibc is not offering the _SAFE macros from the BSD sys/queue.h API — \
recommended when traversing lists to delete/free nodes."
LICENSE = "MIT & X11"

PV = "2.5.3"

RPM_NAME = "libite5-2.5.3-1.1.aarch64.rpm"
RPM_HASH = "da2cbb9ff60ec202cde822cda562a140867e0d83e3a53abc21cd7fdeafe6cf814094b04b0d09787f0501446f1e70fcfa9741c3a22ae47f686273d72300bc798b"

RPROVIDES:${PN} += "libite.so.5 \
libite5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
