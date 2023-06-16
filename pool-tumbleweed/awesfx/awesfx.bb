SUMMARY = "SoundFont Utilities for SB AWE32/64 and Emu10k1 Drivers"
DESCRIPTION = "The AWESFX package includes utility programs for controlling the \
wavetable function on SB AWE32/64 and Emu10k1 sound cards."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "awesfx-0.5.2-3.13.aarch64.rpm"
RPM_HASH = "c20322a52d762ce0330c0e98e862bc2ea2914242b95419ae7a2e8120123bf22b10648f1a66029dba53d40155fa971b90cba331bfc275df7430bd3fd1b62b821c"

RPROVIDES:${PN} += "awesfx"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6"

inherit rpm
