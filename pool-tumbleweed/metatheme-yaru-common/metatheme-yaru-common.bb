SUMMARY = "Common files for the Yaru Gtk Theme"
DESCRIPTION = "This is the theme shaped by the community on the Ubuntu hub."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-only & LGPL-3.0-only & CC-BY-SA-4.0"

PV = "20.10.6.1"

RPM_NAME = "metatheme-yaru-common-20.10.6.1-1.6.noarch.rpm"
RPM_HASH = "8d405c56096e1508390f0959505644ddd10c4bcab737d478a24a706541aa010ede8d0554a8c6b91dabe43e4893a1eb4a7ce0a3a77f3e3eacdcf5a520767f977d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-yaru-common"
RDEPENDS:${PN} += ""

inherit rpm
