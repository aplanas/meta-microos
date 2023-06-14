SUMMARY = "Library for accessing the Windows Minidump (MDMP) format"
DESCRIPTION = "libmdmp is a library to access the Windows Minidump (MDMP) format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210420"

RPM_NAME = "libmdmp1-20210420-3.4.aarch64.rpm"
RPM_HASH = "b578006050b9428efc78e59bd503cca77d8d15161713b6886b1dc9a852e1a789775af843b1887a54af93d898712f8fc066e06030eecf460876918ad547e70e37"

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
