SUMMARY = "UPnP Media Server"
DESCRIPTION = "Gerbera is a UPnP media server which allows streaming digital \
media through a network and consume it on a variety of UPnP \
compatible devices."
LICENSE = "GPL-2.0-only"

PV = "1.12.1"

RPM_NAME = "gerbera-1.12.1-1.4.aarch64.rpm"
RPM_HASH = "3165f58d67d4c9ec69fde7e2014be406b22513d7a23afb92251fdf51e97c8fa2a5634af54e5ff35b53ab38d3068a709725b64f884d6fa980b430e156e94a6eaa"

RPROVIDES:${PN} += "config(gerbera) gerbera gerbera(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavcodec.so.59()(64bit) libavcodec.so.59(LIBAVCODEC_59.37_SUSE)(64bit) libavformat.so.59()(64bit) libavformat.so.59(LIBAVFORMAT_59.27_SUSE)(64bit) libavutil.so.57()(64bit) libavutil.so.57(LIBAVUTIL_57.28_SUSE)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libduktape.so.207()(64bit) libebml.so.5()(64bit) libexiv2.so.27()(64bit) libffmpegthumbnailer.so.4()(64bit) libfmt.so.9()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libixml.so.11()(64bit) libmagic.so.1()(64bit) libmatroska.so.7()(64bit) libmatroska.so.7(V_1.7.0)(64bit) libpugixml.so.1()(64bit) libspdlog.so.1.11()(64bit) libsqlite3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtag.so.1()(64bit) libupnp.so.17()(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) logrotate systemd"

inherit rpm
