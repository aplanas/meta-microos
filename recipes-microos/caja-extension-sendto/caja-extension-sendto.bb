SUMMARY = "A collection of 'sendto' plugins for Caja"
DESCRIPTION = "This package provides extra functionality to the Caja file manager. \
The core package includes CD burner, archiving, email client links \
and devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "caja-extension-sendto-1.26.1-2.3.aarch64.rpm"
RPM_HASH = "b2ef9f9e8389be9de8c99e6f01c60b1d3f6614d5313c5521aedceef8a91c80ff10c33effaece183658b5282cd889046ed4084e26c468da900d7fd355e8e105dd"

RPROVIDES:${PN} += "caja-extension-sendto caja-extension-sendto(aarch-64) caja-sendto libcaja-sendto.so()(64bit) libnstburn.so()(64bit) libnstemailclient.so()(64bit) libnstremovable_devices.so()(64bit) mate-file-manager-sendto"
RDEPENDS:${PN} += "caja ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcaja-extension.so.1()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
