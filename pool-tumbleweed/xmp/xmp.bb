SUMMARY = "Extended Module Player for MOD/S3M/XM/IT/etc."
DESCRIPTION = "The Extended Module Player is a command-line mod player for Unix-like \
systems that plays over 90 mainstream and obscure module formats from \
Amiga, Atari, Acorn, Apple IIgs, C64, and PC, including Protracker \
(MOD), Scream Tracker 3 (S3M), Fast Tracker II (XM), and Impulse \
Tracker (IT) files."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.0"

RPM_NAME = "xmp-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "973403f267250b591b0e850a23f15cb7909dfb958c501c69072e5b6b7221175f0108666a515fd508914320038bd0986adf2c193959b9140eaaceee7abe3790aa"

RPROVIDES:${PN} += "config-xmp \
xmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libpulse-simple.so.0 \
libpulse.so.0 \
libxmp.so.4"

inherit rpm
