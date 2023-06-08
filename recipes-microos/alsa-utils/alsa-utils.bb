SUMMARY = "Advanced Linux Sound Architecture Utilities"
DESCRIPTION = "This package contains utility programs supporting ALSA, Advanced Linux \
Sound Architecture."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.9"

RPM_NAME = "alsa-utils-1.2.9-1.1.aarch64.rpm"
RPM_HASH = "c0d52cee2e800bed983ca42cc6eed82695fb37bcf5b64cac260d608b7d1754fdc52abc55375c6ca438d932df40032e44a85470c930d1f764a82f49c63b0f3bc1"

RPROVIDES:${PN} += "alsa-utils alsa-utils(aarch-64) libalsatplg_module_nhlt.so()(64bit)"
RDEPENDS:${PN} += "/bin/bash /bin/sh alsa dialog ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libasound.so.2(ALSA_0.9.0rc8)(64bit) libatopology.so.2()(64bit) libatopology.so.2(ALSA_0.9)(64bit) libc.so.6(GLIBC_2.34)(64bit) libformw.so.6()(64bit) libformw.so.6(NCURSESTW6_5.7.20081102)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmenuw.so.6()(64bit) libmenuw.so.6(NCURSESTW6_5.7.20081102)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libpanelw.so.6()(64bit) libpanelw.so.6(NCURSESTW6_5.7.20081102)(64bit) libsamplerate.so.0()(64bit) libsamplerate.so.0(libsamplerate.so.0.0)(64bit) libsamplerate.so.0(libsamplerate.so.0.1)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.4.20040208)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) pciutils"

inherit rpm
