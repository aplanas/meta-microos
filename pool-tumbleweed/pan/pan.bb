SUMMARY = "A Newsreader for GNOME"
DESCRIPTION = "Pan is a Usenet newsreader that's good at both text and binaries. \
It supports offline reading, scoring and killfiles, yEnc, NZB, PGP \
handling, multiple servers, and secure connections."
LICENSE = "GPL-2.0-or-later"

PV = "0.154"

RPM_NAME = "pan-0.154-2.3.aarch64.rpm"
RPM_HASH = "6f4e05be2bf34f3779d4e99ae14b74bf397a96cc6ff3ab9b9423f44a4ec6d1be53850e0dd0d5274386142549c29814c8282ec263871c77853d80c1f030fbf5a8"

RPROVIDES:${PN} += "application() \
application(org.gnome.pan.desktop) \
metainfo() \
metainfo(org.gnome.pan.metainfo.xml) \
mimehandler(application/x-nzb) \
pan \
pan(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libenchant-2.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcr-base-3.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmime-3.0.so.0()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtkspell3-3.so.0()(64bit) \
libnotify.so.4()(64bit) \
libpango-1.0.so.0()(64bit) \
libsecret-1.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit)"

inherit rpm
