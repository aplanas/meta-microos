SUMMARY = "MIME Parser and Utility Library"
DESCRIPTION = "GMime is a C/C++ library for parsing and creating messages using \
the Multipurpose Internet Mail Extension (MIME)."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.13"

RPM_NAME = "libgmime-3_0-0-3.2.13-1.2.aarch64.rpm"
RPM_HASH = "b36f024eeed75a4ef4f6d80a50a698947fa4b003492580edc4ab95e3a522711ce912f0e85e53c8451e66880a2b03a3e0b903cc253232ab6c25833f18937b4630"

RPROVIDES:${PN} += "libgmime-3-0-0 \
libgmime-3.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.11 \
libidn2.so.0 \
libz.so.1"

inherit rpm
