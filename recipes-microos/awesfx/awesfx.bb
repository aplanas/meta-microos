SUMMARY = "SoundFont Utilities for SB AWE32/64 and Emu10k1 Drivers"
DESCRIPTION = "The AWESFX package includes utility programs for controlling the \
wavetable function on SB AWE32/64 and Emu10k1 sound cards."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "awesfx-0.5.2-3.13.aarch64.rpm"
RPM_HASH = "c20322a52d762ce0330c0e98e862bc2ea2914242b95419ae7a2e8120123bf22b10648f1a66029dba53d40155fa971b90cba331bfc275df7430bd3fd1b62b821c"

RPROVIDES:${PN} += "awesfx awesfx(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
