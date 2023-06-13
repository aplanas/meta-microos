SUMMARY = "Common files for the Yaru-MATE Gtk Themes"
DESCRIPTION = "Includes the Yaru-MATE themes. \
 \
Introduced as the default theme in Ubuntu MATE 21.04."
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0 & GPL-3.0-or-later"

PV = "22.04.17"

RPM_NAME = "metatheme-yaru-mate-common-22.04.17-1.4.noarch.rpm"
RPM_HASH = "ca4b51fc7bc95ccf0f3e28515590f8facc7f6c9210ec4a505853ac4bc6456be3be84fc5be610d18dcb49044bc51437bb19789ea5e4263c8b78dc57421f2554c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-yaru-mate-common"

RDEPENDS:${PN} += ""

inherit rpm
