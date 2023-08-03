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

PV = "3.6.12"

RPM_NAME = "libsonivox3-3.6.12-1.1.aarch64.rpm"
RPM_HASH = "8fa7a714a5f0a6ea09072a314a86cafe521265f56da32026b8796ccfd516864b727477b1c3be6c234a9ff5cfdf63eb8c6bf384fb0e36087dfde21f0bebff4531"

RPROVIDES:${PN} += "libsonivox.so.3 \
libsonivox3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
