SUMMARY = "A Newsreader for GNOME"
DESCRIPTION = "Pan is a Usenet newsreader that's good at both text and binaries. \
It supports offline reading, scoring and killfiles, yEnc, NZB, PGP \
handling, multiple servers, and secure connections."
LICENSE = "GPL-2.0-or-later"

PV = "0.154"

RPM_NAME = "pan-0.154-2.3.aarch64.rpm"
RPM_HASH = "6f4e05be2bf34f3779d4e99ae14b74bf397a96cc6ff3ab9b9423f44a4ec6d1be53850e0dd0d5274386142549c29814c8282ec263871c77853d80c1f030fbf5a8"

RPROVIDES:${PN} += "pan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libenchant-2.so.2 \
libgcc-s.so.1 \
libgcr-base-3.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmime-3.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkspell3-3.so.0 \
libnotify.so.4 \
libpango-1.0.so.0 \
libsecret-1.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
