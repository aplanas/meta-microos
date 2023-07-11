SUMMARY = "PostScript and PDF converter (development files)"
DESCRIPTION = "PostScript and PDF converter development headers and library files."
LICENSE = "GPL-2.0-or-later"

PV = "4.00"

RPM_NAME = "pstoedit-devel-4.00-1.1.aarch64.rpm"
RPM_HASH = "de5cb02ef56472d64a6ffd2788e5956c475dcd242fafed9633c69414b4aa615331dbe7913de4267b658ccfa840fb5e492afdb3f96478b84a72492ea9133a90d0"

RPROVIDES:${PN} += "pkgconfig-pstoedit \
pstoedit-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ImageMagick-devel \
libMagick++-devel \
libpng-devel \
libzip-devel \
pstoedit"

inherit rpm
