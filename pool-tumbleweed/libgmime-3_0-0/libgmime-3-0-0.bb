SUMMARY = "MIME Parser and Utility Library"
DESCRIPTION = "GMime is a C/C++ library for parsing and creating messages using \
the Multipurpose Internet Mail Extension (MIME)."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.13"

RPM_NAME = "libgmime-3_0-0-3.2.13-1.1.aarch64.rpm"
RPM_HASH = "257d37e321f3695a4dd10ab2c57e76ec9e08145c57022ef5f27656fdfb6e97fe871ccf2c4266d1799b9cbd7a5da264a5e43bcaa1222832271ed7094b8e67b309"

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
