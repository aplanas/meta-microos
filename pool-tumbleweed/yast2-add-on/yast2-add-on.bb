SUMMARY = "YaST2 - Add-On media installation code"
DESCRIPTION = "This package contains YaST Add-On media installation code."
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-add-on-4.6.1-1.1.noarch.rpm"
RPM_HASH = "dce46133205513cfa3019e4cd04c2ff144528c61bb27ed22da2ae9812c888afdbe185e49a47508eb37355c62e1b00d82c94a2fc9404fd4eaea280e1a42e93eb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-add-on"

RDEPENDS:${PN} += "autoyast2-installation \
yast2 \
yast2-country \
yast2-installation \
yast2-packager \
yast2-pkg-bindings \
yast2-ruby-bindings"

inherit rpm
