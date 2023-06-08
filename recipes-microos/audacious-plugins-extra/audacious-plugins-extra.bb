SUMMARY = "Extra plugins for Audacious"
DESCRIPTION = "Extra plugins for the Audacious audio player."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & MIT"

PV = "4.3"

RPM_NAME = "audacious-plugins-extra-4.3-1.4.aarch64.rpm"
RPM_HASH = "9419eff2005362acb05a311934e55763b056c20c72d942a3f1cf3be9688aaddbe122c4343056d06213724a12ac83d3a3feb72582f6c12b0c98a5100d53728ea1"

RPROVIDES:${PN} += "audacious-plugins-extra audacious-plugins-extra(aarch-64)"
RDEPENDS:${PN} += "audacious-plugins ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFLAC.so.12()(64bit) libaudcore.so.5()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libmp3lame.so.0()(64bit) libogg.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libvorbis.so.0()(64bit) libvorbisenc.so.2()(64bit)"

inherit rpm
