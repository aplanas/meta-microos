SUMMARY = "GTK+ theme matching KDE's Breeze -- GTK+ 4 Support"
DESCRIPTION = "A GTK+ theme created to match with the new Plasma 5 Breeze theme."
LICENSE = "LGPL-2.1-only"

PV = "5.27.6"

RPM_NAME = "gtk4-metatheme-breeze-5.27.6-1.1.noarch.rpm"
RPM_HASH = "9d6ce5b63cf7fb12e113fbbdd89788c0c22559da4d9d0fc78d205076d7a4e7efaa1e9c98c8f716a67dbd8d5ae067ceff305225488dc28a3693cd28081321abe0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-metatheme-breeze"

RDEPENDS:${PN} += "metatheme-breeze-common"

inherit rpm
