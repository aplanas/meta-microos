SUMMARY = "Library to parse the cdrecord config file"
DESCRIPTION = "This library implements a mechanism to read the settings from \
cdrecord's config file(s)."
LICENSE = "CDDL-1.0"

PV = "3.02~a10"

RPM_NAME = "libcdrdeflt1_0-3.02~a10-47.3.aarch64.rpm"
RPM_HASH = "92c7327e48c497473fb9a266dc7440d095501b392922924f75baf24b2aa26209cda2eb2f5ab35bdbf2df52db63c301e4cd77680fd61e1c8dab893b465e7f1acd"

RPROVIDES:${PN} += "libcdrdeflt.so.1.0()(64bit) \
libcdrdeflt.so.1.0(SCHILY_1.0)(64bit) \
libcdrdeflt1_0 \
libcdrdeflt1_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdeflt.so.1.0()(64bit) \
libdeflt.so.1.0(SCHILY_1.0)(64bit) \
libschily.so.2.0()(64bit) \
libschily.so.2.0(SCHILY_1.0)(64bit) \
libschily.so.2.0(SCHILY_1.2)(64bit)"

inherit rpm
