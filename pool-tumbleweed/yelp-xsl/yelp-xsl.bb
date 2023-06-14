SUMMARY = "XSL stylesheets for the yelp help browser"
DESCRIPTION = "This package contains XSL stylesheets that are used by the yelp help browser."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "42.1"

RPM_NAME = "yelp-xsl-42.1-1.2.noarch.rpm"
RPM_HASH = "437fc1ac229089d8f91a4757f8be43047ae0a87a057ff4df7c700d0b9c53e2477130aa1411cb922b93e3b648e8c6c990268fe97dd8a217ec64abd347b60d4c87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-yelp-xsl \
yelp-xsl"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
