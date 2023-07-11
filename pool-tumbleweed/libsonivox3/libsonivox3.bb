SUMMARY = "Fork of the AOSP 'platform_external_sonivox' project"
DESCRIPTION = "Sonivox is a fork of the Android Open Source Project 'platform_external_sonivox' \
including a CMake based build system to be used not on Android, but on any other \
Operating System. \
 \
This is a Wave Table synthesizer, not using external soundfont files but \
embedded samples instead. It is also a real time GM synthesizer. \
It may be indicated in projects for small embedded devices. There is neither \
MIDI input nor Audio output facilities included in the library. You need to \
provide your own input/output."
LICENSE = "Apache-2.0"

PV = "3.6.11"

RPM_NAME = "libsonivox3-3.6.11-1.4.aarch64.rpm"
RPM_HASH = "1a39c433fa3e3525bf4d2a41c7e8e358ae975ed3097142e1fe423169842f0a30cabb3df0e8d37ba87279305b9f9ccbfba67f94c8191c3c8d4ff29e5fe90c70c0"

RPROVIDES:${PN} += "libsonivox.so.3 \
libsonivox3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
