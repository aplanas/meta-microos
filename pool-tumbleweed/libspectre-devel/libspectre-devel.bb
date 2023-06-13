SUMMARY = "Library for Rendering PostScript Documents"
DESCRIPTION = "libspectre is a small library for rendering Postscript documents. It \
provides a convenient easy to use API for handling and rendering \
Postscript documents."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.12"

RPM_NAME = "libspectre-devel-0.2.12-1.3.aarch64.rpm"
RPM_HASH = "3969064633a3fb7dcab449d8c7a752428474cd8b065c2c63bfa1ad467ad8f7f5c0d0b7e9cfddb039c2689b769ea967e964c2d34d288dbb53bcd6eb424dcff63b"

RPROVIDES:${PN} += "libspectre-devel \
libspectre-devel(aarch-64) \
pkgconfig(libspectre)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ghostscript-devel \
libspectre1"

inherit rpm
