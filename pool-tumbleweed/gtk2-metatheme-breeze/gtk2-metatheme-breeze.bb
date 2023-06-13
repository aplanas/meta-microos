SUMMARY = "GTK+ theme matching KDE's Breeze -- GTK+ 2 Support"
DESCRIPTION = "A GTK+ theme created to match with the new Plasma 5 Breeze theme."
LICENSE = "LGPL-2.1-only"

PV = "5.27.5"

RPM_NAME = "gtk2-metatheme-breeze-5.27.5-1.1.noarch.rpm"
RPM_HASH = "dfcd29efe289d2b014ede98b75206dae69ae050941c7631f96f44064b6017acebcecf1b81bdec56f8b85fe0d4ff1909d86b343b9e2325aa9e643eaedf1639b51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-breeze"

RDEPENDS:${PN} += "metatheme-breeze-common"

inherit rpm
