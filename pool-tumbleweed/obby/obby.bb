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

RPM_NAME = "obby-0.4.8-11.30.aarch64.rpm"
RPM_HASH = "1c7856bca97b71adff32b50909b3ad2f3a289dd8d7ab823c1888eb5f09aa4ebf32a3c0422bceb8478eae3f05f32c1645fc7f9ce992df018c7d63718fbf13f4f1"

RPROVIDES:${PN} += "obby"

RDEPENDS:${PN} += "libobby-0-4-1 \
obby-lang"

inherit rpm
