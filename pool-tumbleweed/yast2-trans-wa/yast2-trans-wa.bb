SUMMARY = "YaST2 - Walloon Translations"
DESCRIPTION = "YaST2 - Translations for Walloon."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-wa-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "c09fade46b23af7999bbd2d89f264c87e9174ec2f84da048f4e46ac49a4116eca8e0280e585eb9ff9ce6cdeeeee0920ceea103b0d25389126d260760e8e72c6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-wa \
yast2-trans-wa"

RDEPENDS:${PN} += ""

inherit rpm
