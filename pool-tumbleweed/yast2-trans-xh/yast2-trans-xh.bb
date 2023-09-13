SUMMARY = "YaST2 - Xhosa Translations"
DESCRIPTION = "YaST2 - Translations for Xhosa."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-xh-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "41dbb5a8327867f65f1a478b888e0fa3c8ec2a178cdf1c58d7232b3d4335e54a773c2473fd3fe350f85bf911b906e7109a4204cd9849a79346287c314a6ace51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-xh \
yast2-trans-xh"

RDEPENDS:${PN} += ""

inherit rpm
