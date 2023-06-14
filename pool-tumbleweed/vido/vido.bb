SUMMARY = "Online Video Downloader"
DESCRIPTION = "This tool downloads online videos from various sources including \
archive.org and others."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.0"

RPM_NAME = "vido-2.3.0-1.13.aarch64.rpm"
RPM_HASH = "19b6da09b06bc8b5cdf7ecca32d0bd2e1569d55c08d621ad878412bbf71a468ae4793894634ac32956bfede9bd960f5544ab4e832a36b31b2fbf92ad09dbd5cf"

RPROVIDES:${PN} += "vido"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libhandy-1.so.0 \
youtube-dl"

inherit rpm
