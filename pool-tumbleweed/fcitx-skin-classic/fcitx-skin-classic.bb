SUMMARY = "Fcitx Classic Skin"
DESCRIPTION = "Fcitx classic skin. \
 \
You can either use this package or download from kde-look.org using knewstaff in fcitx-config-kde4."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-skin-classic-4.2.9.9-1.6.noarch.rpm"
RPM_HASH = "7fb5f99de122345226fb94f23e8e9df2ec2918d4660c1b6d330b865dfa53185ed296ad1af2f922e8df6e3f2ee35696aadfb215bca6815dfccf7476068619ae35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-skin-classic"

RDEPENDS:${PN} += "fcitx"

inherit rpm
