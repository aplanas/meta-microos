SUMMARY = "Extra binaries from GNU C Library"
DESCRIPTION = "The glibc-extra package contains some extra binaries for glibc that \
are not essential but recommend for use. \
 \
makedb: A program to create a database for nss"
LICENSE = "LGPL-2.1-or-later"

PV = "2.38"

RPM_NAME = "glibc-extra-2.38-1.1.aarch64.rpm"
RPM_HASH = "7982ab0f4a89921c875d601e4791f672c05f636653b4122046d83db6342e1015edc7854dbef688a24e3e19a5415a977a8f5f85935a9d61069c8aee5bc36012d8"

RPROVIDES:${PN} += "glibc-extra"

RDEPENDS:${PN} += "glibc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm
