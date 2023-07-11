SUMMARY = "Library to parse MS Internet Explorer Cache Files"
DESCRIPTION = "libmsiecf is a library to parse MS Internet Explorer Cache Files."
LICENSE = "LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libmsiecf1-20221024-3.7.aarch64.rpm"
RPM_HASH = "5b9aac7aa270df3ab3d682f39576bdda069278d8639aed539cfeceb0ae62f06b29110e9b9a23dd586b4fd089785789f6a78ea1357caa4948e1586858a698c8d7"

RPROVIDES:${PN} += "libmsiecf.so.1 \
libmsiecf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfvalue.so.1"

inherit rpm
