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

RPM_NAME = "obby-devel-0.4.8-11.30.aarch64.rpm"
RPM_HASH = "8cefa9ace41048d052d46c45a9b97252ff34a21aa286115f1b8e1b7b99a30308759481ecc0aa6c2a46771b6267cd450bcda89ea576471a60673bb0b2958725f4"

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
