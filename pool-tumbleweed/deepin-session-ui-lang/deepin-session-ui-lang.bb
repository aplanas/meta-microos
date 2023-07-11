SUMMARY = "Translations for package deepin-session-ui"
DESCRIPTION = "Provides translations for the 'deepin-session-ui' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.5.24"

RPM_NAME = "deepin-session-ui-lang-5.5.24-1.4.noarch.rpm"
RPM_HASH = "730ee1ac92371ca1d57e51c1181ad6e2d19a3d1021958b2a15f0efa08c4c6f78dddb90d603869624184db2a986f2d0cea842170b0f48cefe5b7fe983dd098eb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-session-ui-lang \
deepin-session-ui-lang-all"

RDEPENDS:${PN} += "deepin-session-ui"

inherit rpm
