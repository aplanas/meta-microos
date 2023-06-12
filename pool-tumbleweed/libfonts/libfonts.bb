SUMMARY = "TrueType Font Layouting"
DESCRIPTION = "LibFonts is a library developed to support advanced layouting in JFreeReport. \
This library allows to read TrueType font files to extract layouting specific \
information."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libfonts-1.1.6-1.4.noarch.rpm"
RPM_HASH = "5da7a2a5315d8f8b9193338025df02abf9b8be2517fbc45abfaddf6bcd850f6d1476f5f479d1b653a7f8efb822f6186042be8a3512d098f08d2644bb83c86f9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfonts"
RDEPENDS:${PN} += "java \
jpackage-utils \
libloader"

inherit rpm
