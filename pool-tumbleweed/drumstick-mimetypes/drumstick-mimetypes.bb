SUMMARY = "MIDI Sequencer C++ Library MIME types"
DESCRIPTION = "This package includes a mimetype for Cakewalk project files."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "drumstick-mimetypes-2.7.2-1.3.aarch64.rpm"
RPM_HASH = "3feea62ea92b1926a01ce2ceb5ef1b2ddddc1a102fd99d27dcc6df63ea96fd1754f386f8d14fbcb8760084227344a024b0f5ff08dc5acb3ca38811ab700e144d"

RPROVIDES:${PN} += "drumstick-mimetypes"

RDEPENDS:${PN} += ""

inherit rpm
