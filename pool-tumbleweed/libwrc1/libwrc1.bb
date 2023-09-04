SUMMARY = "Library to support the Windows Resource Compiler format"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "libwrc1-20230318-2.1.aarch64.rpm"
RPM_HASH = "d73a8f8be155001b300c90400c5bc23be7bf89cf5646070b923cd6c7f84278fb72f75c8c7095696a94fad7a2475f807944af0f42b0a4abaeab1d4314ad69a723"

RPROVIDES:${PN} += "libwrc.so.1 \
libwrc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfvalue.so.1 \
libuna.so.1"

inherit rpm
