SUMMARY = "Library for accessing the Windows Minidump (MDMP) format"
DESCRIPTION = "libmdmp is a library to access the Windows Minidump (MDMP) format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210420"

RPM_NAME = "libmdmp1-20210420-3.5.aarch64.rpm"
RPM_HASH = "161d42a46b9054ef06e0f10de31e56a44a394bccbc9e7b418c9a51b5a31d0d9aecd19fe40288999cf78420f1304ecfaf379dd6ba3830392efa9185c1ccc61268"

RPROVIDES:${PN} += "libmdmp.so.1 \
libmdmp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdata.so.1"

inherit rpm
