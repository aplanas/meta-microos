SUMMARY = "MIDI Sequencer C++ Library MIME types"
DESCRIPTION = "This package includes a mimetype for Cakewalk project files."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "drumstick-mimetypes-2.7.2-1.4.aarch64.rpm"
RPM_HASH = "15abbc1aa7d729668eb97cc64a27791bbd99f177f79da4802a2e068bb5a230553486dc943a936d59ed163906a9749a5ea86d0a24f40454fdd81d2fba095ea4a4"

RPROVIDES:${PN} += "drumstick-mimetypes"

RDEPENDS:${PN} += ""

inherit rpm
