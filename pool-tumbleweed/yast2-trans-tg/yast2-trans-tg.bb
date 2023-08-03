SUMMARY = "YaST2 - Tajik Translations"
DESCRIPTION = "YaST2 - Tajik translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-tg-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "d97407ebd2dd14a03c9c132a2c2e7f3e68f3923c704d2d464f314a145fc7806dcc20297ff302cc6044f04af419cf96052d95fc7be5ed9b76ea93f62963d9b300"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-tg \
yast2-trans-tg"

RDEPENDS:${PN} += ""

inherit rpm
