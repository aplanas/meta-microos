SUMMARY = "Music Player Daemon Client"
DESCRIPTION = "ncmpcpp is an ncurses client for MPD (Music Player Daemon), inspired \
by ncmpc. It features a tag editor, playlist editor, search engine, \
media library, music visualizer, a last.fm artist database \
information fetcher and an alternative user interface."
LICENSE = "GPL-2.0-only"

PV = "0.9.2"

RPM_NAME = "ncmpcpp-0.9.2-2.16.aarch64.rpm"
RPM_HASH = "4428a2aef06a96fae4764e064feb078bd4b0d04a9ad56f407e91612e9e0399e05923cd13ad6067d1a9621589789dacbb2cfcc9d5104b565abf0bd86332b262c2"

RPROVIDES:${PN} += "ncmpcpp \
ncmpcpp(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_locale.so.1.82.0()(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libfftw3.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libmpdclient.so.2()(64bit) \
libmpdclient.so.2(libmpdclient2)(64bit) \
libncursesw.so.6()(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libtag.so.1()(64bit) \
libtinfo.so.6()(64bit) \
mpd"

inherit rpm
