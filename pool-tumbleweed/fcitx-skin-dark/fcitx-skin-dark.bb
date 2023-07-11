SUMMARY = "Fcitx Dark Skin"
DESCRIPTION = "Fcitx dark skin. \
 \
You can either use this package for download from kde-look.org using knewstaff in fcitx-config-kde4."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-skin-dark-4.2.9.9-1.6.noarch.rpm"
RPM_HASH = "51495c976823f28740364bf05c149bd28c9e2238b71ec55cdd9e95a602ca9c359a748226f13e1925835648e8c93699ec5987534f7647784eb4ca1100bf5ad149"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-skin-dark"

RDEPENDS:${PN} += "fcitx"

inherit rpm
