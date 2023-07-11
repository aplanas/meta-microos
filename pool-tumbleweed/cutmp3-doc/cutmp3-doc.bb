SUMMARY = "Documentation for cutmp3"
DESCRIPTION = "This is a program to edit MP3 files without quality loss, using an \
ncurses-based user interface. \
 \
This package contains a user guide and a list of key bindings for cutmp3"
LICENSE = "GPL-2.0+"

PV = "3.0.1"

RPM_NAME = "cutmp3-doc-3.0.1-2.23.aarch64.rpm"
RPM_HASH = "b190d28b85b312b05e20ba33462e4a2f0417a78e6e8c6c7124a9d4c23caa344826bb275094598ab5b6870c7147e4d21a9c4e18c707e9efc9ad4fa965d5012368"

RPROVIDES:${PN} += "cutmp3-doc"

RDEPENDS:${PN} += "cutmp3"

inherit rpm
