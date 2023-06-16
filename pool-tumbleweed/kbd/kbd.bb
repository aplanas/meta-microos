SUMMARY = "Keyboard and Font Utilities"
DESCRIPTION = "Load and save keyboard mappings. This is needed if you are not using \
the US keyboard map. This package also contains utilities for changing \
your console fonts. If you install this package, YaST includes an extra \
menu to allow you to choose between the different fonts. This package \
also includes fonts from the kbd_fonts.tar.gz package (by Paul \
Gortmaker) on Sunsite."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.1"

RPM_NAME = "kbd-2.5.1-1.3.aarch64.rpm"
RPM_HASH = "1b0f18be0e9f6823af87949668268a865eff5a72f20c63978f3c9739c350a38d00a7cbe56693707dd1a5ba5cc4aa5212251b0d31bf3101a232e935d88ec1fc26"

RPROVIDES:${PN} += "kbd \
vlock"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
coreutils \
fillup \
kbd-legacy \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpam-misc.so.0 \
libpam.so.0"

inherit rpm
