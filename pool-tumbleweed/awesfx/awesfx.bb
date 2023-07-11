SUMMARY = "SoundFont Utilities for SB AWE32/64 and Emu10k1 Drivers"
DESCRIPTION = "The AWESFX package includes utility programs for controlling the \
wavetable function on SB AWE32/64 and Emu10k1 sound cards."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "awesfx-0.5.2-3.14.aarch64.rpm"
RPM_HASH = "96e795a2d7e56c8e345c69ff4d12ea76363f09884ba82e673bc17c61ab7712301e5c69bcd3b6b79b9df05db1407ca2ad7fe391d8e3065cc22fe8ce6267baa5c7"

RPROVIDES:${PN} += "awesfx"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6"

inherit rpm
