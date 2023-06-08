SUMMARY = "D-Bus service for Fingerprint reader access"
DESCRIPTION = "The fprint project provides a central system \
to support consumer fingerprint reader devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.94.2"

RPM_NAME = "fprintd-1.94.2-2.4.aarch64.rpm"
RPM_HASH = "7a99c84b35f75c4046df1dcb848f1b3fb21a3e23e0c727926e690d9fbe6703807afa638a25f3b80b9b986a54bcdc936207cf63d1aae62d0987f23f02d2766a0c"

RPROVIDES:${PN} += "config(fprintd) fprintd fprintd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfprint-2.so.2()(64bit) libfprint-2.so.2(LIBFPRINT_2.0.0)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libpolkit-gobject-1.so.0()(64bit) systemd"

inherit rpm
