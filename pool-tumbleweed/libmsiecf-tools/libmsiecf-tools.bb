SUMMARY = "Utilities to inspect MS Internet Explorer Cache Files"
DESCRIPTION = "Several tools for reading MS Internet Explorer Cache files."
LICENSE = "LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libmsiecf-tools-20221024-4.1.aarch64.rpm"
RPM_HASH = "ac0211c2a63f0cb2d4022618dadba26539c33c17a8efffccb5a1ef9335ed0136db588b30be68429d283f46a5fc9835c56e87a01cbeac1ff0aec0cbf74c73f73a"

RPROVIDES:${PN} += "libmsiecf-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libmsiecf.so.1"

inherit rpm
