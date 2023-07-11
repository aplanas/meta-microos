SUMMARY = "Keyboard and Font Utilities"
DESCRIPTION = "Load and save keyboard mappings. This is needed if you are not using \
the US keyboard map. This package also contains utilities for changing \
your console fonts. If you install this package, YaST includes an extra \
menu to allow you to choose between the different fonts. This package \
also includes fonts from the kbd_fonts.tar.gz package (by Paul \
Gortmaker) on Sunsite."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.6.1"

RPM_NAME = "kbd-2.6.1-1.1.aarch64.rpm"
RPM_HASH = "7579125a391c63cb0dc42c02612c4cf539641b48f725f3326e12c166aa985d55b8a27c5c79c25700033394066694cf07155e1fa37669e734f8d880c245f31a17"

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
