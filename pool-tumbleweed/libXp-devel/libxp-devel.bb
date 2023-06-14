SUMMARY = "Development files for the X Printing Extension library"
DESCRIPTION = "libXp provides APIs to allow client applications to render to \
non-display devices. \
 \
This package contains the development headers for the library found \
in libXp6."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "libXp-devel-1.0.4-1.2.aarch64.rpm"
RPM_HASH = "96408ba8edd5b1756dc3e72dab36dd72818a0ec458ee22f7d0666adca39ebe5e7ce23ba1643a720a2ef56de249d30bff382f9835ac180e55b3319799ff454739"

RPROVIDES:${PN} += "libXp-devel \
pkgconfig-xp \
xorg-x11-libXp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXp6 \
pkgconfig-printproto \
pkgconfig-x11 \
pkgconfig-xau \
pkgconfig-xext"

inherit rpm
