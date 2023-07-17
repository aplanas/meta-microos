SUMMARY = "YaST2 - Macedonian Translations"
DESCRIPTION = "YaST2 - Translations for Macedonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-mk-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "f2bc5139cd6ace5eeeb28bdee7b5177e4478ff229648a8b86d3c4186a9975147807cab8e2054083bf4838f9957bc18723f4ff9530aebcb0ee3cf200c69c07e3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-mk \
yast2-trans-mk"

RDEPENDS:${PN} += ""

inherit rpm
