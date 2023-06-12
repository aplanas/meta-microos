SUMMARY = "Text-mode music player"
DESCRIPTION = "C* Music Player is a small and fast text mode (ncurses-based) music player \
for Unix-like operating systems."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "a127a1569fb5c7ee04a6c0e6256673abadc0a80ca7c8eb16478d835e836b560be403c5ae14284c5655cddda382e4781475bc9b22c0e05db2a89a019a2957086e"

RPROVIDES:${PN} += "cmus cmus(aarch-64) config(cmus)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdiscid.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_221)(64bit) libsystemd.so.0(LIBSYSTEMD_243)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
