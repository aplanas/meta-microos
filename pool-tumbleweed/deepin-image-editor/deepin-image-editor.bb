SUMMARY = "Libraries of Deepin Image editor"
DESCRIPTION = "Libraries of Deepin Image editor"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.24"

RPM_NAME = "deepin-image-editor-1.0.24-1.1.aarch64.rpm"
RPM_HASH = "b724bed08d615618e52a05be895924fb030dedc3b4c8880d4a140d20c1af01d77653ea357f866cb372c91134aaf3e32378b50a457fa2afaf4352ce58d69c0dda"

RPROVIDES:${PN} += "deepin-image-editor"

RDEPENDS:${PN} += ""

inherit rpm
