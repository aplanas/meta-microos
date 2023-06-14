SUMMARY = "Utilities to inspect Resilient File Systems"
DESCRIPTION = "This subpackage provides the utilities from libfsrefs, which allows for \
reading Resilient File System (ReFS)."
LICENSE = "LGPL-3.0-or-later"

PV = "20210422"

RPM_NAME = "libfsrefs-tools-20210422-3.3.aarch64.rpm"
RPM_HASH = "e8ce84a3910c6b878d3b975c900bb4f608ec3dcd664c007969341ed562855d9ebdffe4c6b4cc52ce2903ee316cb1073c1c01e74d07e0d2c2d47624d47722b153"

RPROVIDES:${PN} += "libfsrefs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfsrefs.so.1"

inherit rpm
