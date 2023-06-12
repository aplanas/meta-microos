SUMMARY = "Utilities to inspect Windows Resource Compiler files"
DESCRIPTION = "This subpackage provides the utilities from libwrc, which allows for \
reading Windows Resource Compiler files."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "libwrc-tools-20230318-1.2.aarch64.rpm"
RPM_HASH = "32fa84760f96a248a8523ff88da4762c2930ae72860e4d29653639a002bb12363130f2726033e0458db9b5ddba7abadc3ee76dba4528240f5ec1c024283284c6"

RPROVIDES:${PN} += "libwrc-tools \
libwrc-tools(aarch-64)"
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
libexe.so.1()(64bit) \
libexe.so.1(V_20210424)(64bit) \
libfwnt.so.1()(64bit) \
libfwnt.so.1(V_20220922)(64bit) \
libwrc.so.1()(64bit) \
libwrc.so.1(V_20230318)(64bit)"

inherit rpm
