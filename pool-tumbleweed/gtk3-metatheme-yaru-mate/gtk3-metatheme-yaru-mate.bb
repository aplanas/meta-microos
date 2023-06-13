SUMMARY = "GTK+ 3 support for the Yaru-MATE Gtk Themes"
DESCRIPTION = "Includes the Yaru-MATE themes. \
 \
Introduced as the default theme in Ubuntu MATE 21.04."
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0 & GPL-3.0-or-later"

PV = "22.04.17"

RPM_NAME = "gtk3-metatheme-yaru-mate-22.04.17-1.4.noarch.rpm"
RPM_HASH = "3cebbe070de92f3b4e499479ab0f69efd8c322bc114db6d1cc2ce1dc0c076b62d9d849244a261529feb39f5519909a5f191c4b96cfd398ee13fc473d0ecedd38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-yaru-mate"

RDEPENDS:${PN} += "metatheme-yaru-mate-common"

inherit rpm
