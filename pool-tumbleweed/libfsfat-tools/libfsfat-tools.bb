SUMMARY = "Utilities to inspect FAT file systems"
DESCRIPTION = "This subpackage provides the utilities from libfsfat, which allows for \
reading FAT File Systems."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "libfsfat-tools-20220925-3.9.aarch64.rpm"
RPM_HASH = "31ccac13466061c9b27dbb000d8546ff8e432c08298125a002b901187652f47a1112d241cae765049d3854c31b7066f34495108137d2a499c13d73a574e3f5d4"

RPROVIDES:${PN} += "libfsfat-tools \
libfsfat-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libfdatetime.so.1()(64bit) \
libfdatetime.so.1(V_20220112)(64bit) \
libfsfat.so.1()(64bit) \
libfsfat.so.1(V_20220925)(64bit) \
libhmac.so.1()(64bit) \
libhmac.so.1(V_20230407)(64bit) \
libuna.so.1()(64bit) \
libuna.so.1(V_20220611)(64bit)"

inherit rpm
