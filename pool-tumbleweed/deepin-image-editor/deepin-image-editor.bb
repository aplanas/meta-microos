SUMMARY = "Libraries of Deepin Image editor"
DESCRIPTION = "Libraries of Deepin Image editor"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.24"

RPM_NAME = "deepin-image-editor-1.0.24-1.2.aarch64.rpm"
RPM_HASH = "cfe521a472ea24a2c5ed2fe6694a2fb9e1186176cc11eb6e3b7a622d0e15ad63c5fa7f4716e7e66c85e445e39ee190a5681f3e3f3a9eb7e06b9f159c0048a2f5"

RPROVIDES:${PN} += "deepin-image-editor"

RDEPENDS:${PN} += ""

inherit rpm
