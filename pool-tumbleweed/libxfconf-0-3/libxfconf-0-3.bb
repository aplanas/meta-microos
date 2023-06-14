SUMMARY = "Xfconf Shared Library"
DESCRIPTION = "This package contains the xfconf shared library."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.1"

RPM_NAME = "libxfconf-0-3-4.18.1-1.1.aarch64.rpm"
RPM_HASH = "bed7b26fa97e1dced9f03ca5ef06121aaed14a1c840a6309b4604833352f0b3c1966a5b86a9bdfd0327c17d49425cd59b279e5a5d0155a4bad83becc26b4fa2b"

RPROVIDES:${PN} += "libxfce4mcs \
libxfconf-0-3 \
libxfconf-0.so.3 \
libxfconfgsettingsbackend.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
xfconf"

inherit rpm
