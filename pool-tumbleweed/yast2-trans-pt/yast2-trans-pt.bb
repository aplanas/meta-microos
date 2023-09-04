SUMMARY = "YaST2 - Portuguese Translations"
DESCRIPTION = "YaST2 - Translations for Portuguese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-pt-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "387700bebd9aff14fef787d26da3c51e2ad3d81a85b163f6b40ae9331066f4a709ca82d92f9a8e6c732f2635e8950f6a2dfbee01a9c214d601a435e7d99d744c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pt \
yast2-trans-pt"

RDEPENDS:${PN} += ""

inherit rpm
