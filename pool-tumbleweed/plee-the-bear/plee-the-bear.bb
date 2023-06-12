SUMMARY = "Plee the Bear, a 2D platform game"
DESCRIPTION = "Plee the Bear is a 2D platform game like those found on consoles in \
the beginning of the 1990s. The storyline centeres around an angry \
bear whose son has been kidnapped by God."
LICENSE = "GPL-3.0-only"

PV = "0.7.1"

RPM_NAME = "plee-the-bear-0.7.1-2.23.aarch64.rpm"
RPM_HASH = "27a2f19de44beb6fbbd2213d48f3c66c8c615ffac27682b53a8215d8c10b8484da5b222f1a6e88a5ac4f13d5e32fb676e343987c28ac863ade44e1dca5618d5d"

RPROVIDES:${PN} += "application() \
application(plee-the-bear.desktop) \
libbear_audio.so()(64bit) \
libbear_communication.so()(64bit) \
libbear_debug.so()(64bit) \
libbear_engine.so()(64bit) \
libbear_expr.so()(64bit) \
libbear_generic_items.so()(64bit) \
libbear_gui.so()(64bit) \
libbear_input.so()(64bit) \
libbear_net.so()(64bit) \
libbear_text_interface.so()(64bit) \
libbear_time.so()(64bit) \
libbear_universe.so()(64bit) \
libbear_visual.so()(64bit) \
libplee_the_bear.so()(64bit) \
metainfo() \
metainfo(plee-the-bear.appdata.xml) \
plee-the-bear \
plee-the-bear(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.7)(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libclaw_application.so.1()(64bit) \
libclaw_configuration_file.so.1()(64bit) \
libclaw_dynamic_library.so.1()(64bit) \
libclaw_graphic.so.1()(64bit) \
libclaw_logger.so.1()(64bit) \
libclaw_net.so.1()(64bit) \
libclaw_tween.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
