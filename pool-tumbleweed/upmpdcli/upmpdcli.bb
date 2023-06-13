SUMMARY = "UPnP Media Renderer front-end to MPD, the Music Player Daemon"
DESCRIPTION = "Upmpdcli turns MPD, the Music Player Daemon into an UPnP Media Renderer, \
usable with most UPnP Control Point applications, such as those which run \
on Android tablets or phones."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.7"

RPM_NAME = "upmpdcli-1.7.7-1.1.aarch64.rpm"
RPM_HASH = "68e8517330b267bf456340e3367b9d68f7e0a85ec7e5df2aaa91b5b21e57c9b5183721e7ac36cf3f015bdcc97e4946900893940497895d5713fd800169c8c98c"

RPROVIDES:${PN} += "config(upmpdcli) \
upmpdcli \
upmpdcli(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
group(audio) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libjsoncpp.so.25()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmicrohttpd.so.12()(64bit) \
libmpdclient.so.2()(64bit) \
libmpdclient.so.2(libmpdclient2)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libupnpp.so.12()(64bit) \
shadow"

inherit rpm
