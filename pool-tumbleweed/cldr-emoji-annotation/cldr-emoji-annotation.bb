SUMMARY = "Emoji annotation files in CLDR"
DESCRIPTION = "This package contains the pkg-config files for development when building \
programs that use cldr-annotations."
LICENSE = "LGPL-2.0-or-later & Unicode"

PV = "36.12.120191002_0"

RPM_NAME = "cldr-emoji-annotation-36.12.120191002_0-1.10.noarch.rpm"
RPM_HASH = "785b7733d8453273643690f235a9483e5bcf5b4bd8b4566026c5b17f6500363c6c00435cd420ec5338d6521e6f8b7617956a5d05b2f6a27606e11870dfd523f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cldr-emoji-annotation"

RDEPENDS:${PN} += ""

inherit rpm
