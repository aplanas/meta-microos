SUMMARY = "Ayatana panel indicator applet library"
DESCRIPTION = "This package provides the libraries required to build indicators \
and to go into the indicator applet."
LICENSE = "GPL-3.0-only"

PV = "0.9.0"

RPM_NAME = "libayatana-indicator3-7-0.9.0-1.11.aarch64.rpm"
RPM_HASH = "704eb95b3688b8fc16a19d80df782f1d54b8b627be4a2e101446957fb488a3926cbb1d0bce85e1f8b06ee2893580a80cb2ff9bbc6e1803ef1d4634b07fac12b6"

RPROVIDES:${PN} += "libayatana-indicator3-7 \
libayatana-indicator3-7(aarch-64) \
libayatana-indicator3.so.7()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libayatana-ido3-0.4.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
