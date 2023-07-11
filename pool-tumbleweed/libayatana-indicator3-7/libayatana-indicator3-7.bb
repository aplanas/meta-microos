SUMMARY = "Ayatana panel indicator applet library"
DESCRIPTION = "This package provides the libraries required to build indicators \
and to go into the indicator applet."
LICENSE = "GPL-3.0-only"

PV = "0.9.0"

RPM_NAME = "libayatana-indicator3-7-0.9.0-1.12.aarch64.rpm"
RPM_HASH = "57d9fbcf0faee996705477ca61b2a927f7e930424ee1d7aa515c5f24cd8a3370b297f0ecaaad4601c5e283eb38e7755e5077d6c5f089f27139c29372d546a374"

RPROVIDES:${PN} += "libayatana-indicator3-7 \
libayatana-indicator3.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libayatana-ido3-0.4.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
