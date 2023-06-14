SUMMARY = "Ayatana panel indicator applet library"
DESCRIPTION = "This package provides the libraries required to build indicators \
and to go into the indicator applet."
LICENSE = "GPL-3.0-only"

PV = "0.9.0"

RPM_NAME = "libayatana-indicator3-7-0.9.0-1.11.aarch64.rpm"
RPM_HASH = "704eb95b3688b8fc16a19d80df782f1d54b8b627be4a2e101446957fb488a3926cbb1d0bce85e1f8b06ee2893580a80cb2ff9bbc6e1803ef1d4634b07fac12b6"

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
