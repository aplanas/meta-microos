SUMMARY = "Utilities to inspect Resilient File Systems"
DESCRIPTION = "This subpackage provides the utilities from libfsrefs, which allows for \
reading Resilient File System (ReFS)."
LICENSE = "LGPL-3.0-or-later"

PV = "20210422"

RPM_NAME = "libfsrefs-tools-20210422-3.3.aarch64.rpm"
RPM_HASH = "e8ce84a3910c6b878d3b975c900bb4f608ec3dcd664c007969341ed562855d9ebdffe4c6b4cc52ce2903ee316cb1073c1c01e74d07e0d2c2d47624d47722b153"

RPROVIDES:${PN} += "libfsrefs-tools \
libfsrefs-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6()(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libfsrefs.so.1()(64bit) \
libfsrefs.so.1(V_20210422)(64bit)"

inherit rpm
