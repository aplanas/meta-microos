SUMMARY = "Backup software to synchronize files and folders"
DESCRIPTION = "RealtimeSync executes a command each time it detects changes \
in one of the monitored directories, or when a directory becomes \
available (e.g. insertion of a USB drive). \
This command will usually trigger a FreeFileSync batch job."
LICENSE = "GPL-3.0-or-later"

PV = "12.0"

RPM_NAME = "RealtimeSync-12.0-1.2.aarch64.rpm"
RPM_HASH = "ee677e60ae9706d389f98f9b72d40c9e3330f8fc2e5259bafad664ecf7a5d069ff8d33eb354adc74825324aa55d83bbfc67216befa4e6b9349a27fa29686c273"

RPROVIDES:${PN} += "RealtimeSync RealtimeSync(aarch-64) application() application(RealTimeSync.desktop)"
RDEPENDS:${PN} += "FreeFileSync ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.31)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libwx_baseu-suse.so.8.0.0()(64bit) libwx_baseu-suse.so.8.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse.so.8.0.0()(64bit) libwx_gtk3u_core-suse.so.8.0.0(WXU_3.2)(64bit) libwx_gtk3u_richtext-suse.so.8.0.0()(64bit) libwx_gtk3u_richtext-suse.so.8.0.0(WXU_3.2)(64bit)"

inherit rpm
