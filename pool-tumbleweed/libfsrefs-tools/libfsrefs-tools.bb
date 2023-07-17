SUMMARY = "Utilities to inspect Resilient File Systems"
DESCRIPTION = "This subpackage provides the utilities from libfsrefs, which allows for \
reading Resilient File System (ReFS)."
LICENSE = "LGPL-3.0-or-later"

PV = "20210422"

RPM_NAME = "libfsrefs-tools-20210422-3.6.aarch64.rpm"
RPM_HASH = "1317cb8fa3dc248147867641a3a54dab0007aff55d2d1596fb8cafe2e8282c60ca3481cc317358e6c961070677ee027a789f805791538cba0685c8b0e6eb370a"

RPROVIDES:${PN} += "libfsrefs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfsrefs.so.1"

inherit rpm
