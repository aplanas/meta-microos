SUMMARY = "Music Player Daemon Client"
DESCRIPTION = "ncmpcpp is an ncurses client for MPD (Music Player Daemon), inspired \
by ncmpc. It features a tag editor, playlist editor, search engine, \
media library, music visualizer, a last.fm artist database \
information fetcher and an alternative user interface."
LICENSE = "GPL-2.0-only"

PV = "0.9.2"

RPM_NAME = "ncmpcpp-0.9.2-2.16.aarch64.rpm"
RPM_HASH = "4428a2aef06a96fae4764e064feb078bd4b0d04a9ad56f407e91612e9e0399e05923cd13ad6067d1a9621589789dacbb2cfcc9d5104b565abf0bd86332b262c2"

RPROVIDES:${PN} += "ncmpcpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-locale.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libcurl.so.4 \
libfftw3.so.3 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
libm.so.6 \
libmpdclient.so.2 \
libncursesw.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
libtag.so.1 \
libtinfo.so.6 \
mpd"

inherit rpm
