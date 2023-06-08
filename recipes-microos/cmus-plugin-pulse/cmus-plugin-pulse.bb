SUMMARY = "Pulseaudio output plugin for the C* Music Player"
DESCRIPTION = "This package provides PulseAudio output support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-pulse-2.10.0-1.8.aarch64.rpm"
RPM_HASH = "0831cfac6d6af16fd810294c999ccc7ff440da1f80182bf3066330c30aab1f2abadd87fee3ea0699a3a44e8b2990ea392b9e26946989e8d1646e9a9cb51e3c1f"

RPROVIDES:${PN} += "cmus-plugin-pulse cmus-plugin-pulse(aarch-64)"
RDEPENDS:${PN} += "cmus ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.28)(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit)"

inherit rpm
