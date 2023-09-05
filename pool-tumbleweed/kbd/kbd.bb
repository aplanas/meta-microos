SUMMARY = "Keyboard and Font Utilities"
DESCRIPTION = "Load and save keyboard mappings. This is needed if you are not using \
the US keyboard map. This package also contains utilities for changing \
your console fonts. If you install this package, YaST includes an extra \
menu to allow you to choose between the different fonts. This package \
also includes fonts from the kbd_fonts.tar.gz package (by Paul \
Gortmaker) on Sunsite."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.6.2"

RPM_NAME = "kbd-2.6.2-1.1.aarch64.rpm"
RPM_HASH = "21986237c848d305c874cd2dfe73ef0b836a0184ba4e95906bb2bd2a017190bc39f49a5f0c2e2212cee32d146c252c2ba310c51d7089276f7f4740130d141def"

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
