SUMMARY = "TrueType Font Layouting"
DESCRIPTION = "LibFonts is a library developed to support advanced layouting in JFreeReport. \
This library allows to read TrueType font files to extract layouting specific \
information."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libfonts-1.1.6-1.5.noarch.rpm"
RPM_HASH = "1fa24777fdaa71eb6faa992acf3f653a2239fc26034f9ccc72430a07b0c8246368917252f49a1de185627a478cbd3fb74407a9a82cdd44e826a1ed230c921a79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfonts"

RDEPENDS:${PN} += "java \
jpackage-utils \
libloader"

inherit rpm
