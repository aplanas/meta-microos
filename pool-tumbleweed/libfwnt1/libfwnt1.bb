SUMMARY = "Library for Windows NT data types"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "LGPL-3.0-or-later"

PV = "20220922"

RPM_NAME = "libfwnt1-20220922-3.1.aarch64.rpm"
RPM_HASH = "28489154a03645db08092a67349bdd1a913eaa9da60084fb66d137dc7bc5941174b19d9c67eed8b54ec307dded534e0488ed79e8851f59b7735ab20790de093d"

RPROVIDES:${PN} += "libfwnt.so.1 \
libfwnt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcnotify.so.1"

inherit rpm
