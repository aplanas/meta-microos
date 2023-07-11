SUMMARY = "YaST2 - Slovak Translations"
DESCRIPTION = "YaST2 - Slovak Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-sk-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "4be2cf2a04c2afe21e925c5505fd567e90c6216c8998209197d6345ab3dbae81fa749a023ca2877cf5eee628cb4c179c87907baf9ca69bb619e6801c26c0f23b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sk \
yast2-trans-sk"

RDEPENDS:${PN} += ""

inherit rpm
