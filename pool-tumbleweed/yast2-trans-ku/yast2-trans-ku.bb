SUMMARY = "YaST2 - Kurdish Translations"
DESCRIPTION = "YaST2 - Kurdish Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-ku-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "5e5d13be82b7e514f9d1991b8bf232acc5f462bd5b0dfa467885f6aa56076ddd6b768a5cbaa3adefeda2214ba6b8d603c092b388097daa14b45a16478403c9d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ku \
yast2-trans-ku"

RDEPENDS:${PN} += ""

inherit rpm
