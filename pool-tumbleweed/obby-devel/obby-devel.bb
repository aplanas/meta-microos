SUMMARY = "Synced document buffers"
DESCRIPTION = "obby is a library which provides synced document buffers. It supports \
multiple documents in one session and is portable to both Windows and \
Unix-like platforms. \
 \
 \
 \
Authors: \
-------- \
    Armin Burgmeier <armin@0x539.de> \
    Philipp Kern <phil@0x539.de>"
LICENSE = "GPL-2.0+"

PV = "0.4.8"

RPM_NAME = "obby-devel-0.4.8-11.29.aarch64.rpm"
RPM_HASH = "16f7ccc8c26782d3ab3e87c71daa00d265c5ebef9b6846777944b784194152b5ea973a4e83065a453fb7d6848640ba5778f17d2206e20e76606030d678cc3452"

RPROVIDES:${PN} += "obby-devel \
pkgconfig-obby-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavahi-devel \
libsigc++2-devel \
net6-devel \
obby \
pkgconfig-avahi-client \
pkgconfig-net6-1.3 \
pkgconfig-sigc++-2.0"

inherit rpm
