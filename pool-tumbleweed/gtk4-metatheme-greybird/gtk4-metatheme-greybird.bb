SUMMARY = "GTK+ 3 support for the Greybird theme"
DESCRIPTION = "This package provides the GTK+ 4 support of Greybird"
LICENSE = "CC-BY-SA-3.0 | GPL-2.0-or-later"

PV = "3.23.2+git0.25f312f"

RPM_NAME = "gtk4-metatheme-greybird-3.23.2+git0.25f312f-2.1.noarch.rpm"
RPM_HASH = "08f7159a0fae65fb7d1c9e4a2f341126b5ca70b816a8e10dedbca31cefad588d76f3791a33861d107dca95e380bd1714456e7715328625c46f50157a66e6710c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-metatheme-greybird"

RDEPENDS:${PN} += "metatheme-greybird-common"

inherit rpm
