SUMMARY = "YaST2 - Persian Translations"
DESCRIPTION = "YaST2 - Persian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-fa-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "5c3d90c3e5ebf25f5c32a96995e6c2ac91d3995320a411c0e1f5bf438ce8e0340331d8b5441eadecd75cc79b1f2060105cf2e6ca5ba7fd99d00761ca65fd19a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-fa \
yast2-trans-fa"

RDEPENDS:${PN} += ""

inherit rpm
