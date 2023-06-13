SUMMARY = "YaST2 - Croatian Translations"
DESCRIPTION = "YaST2 - Croatian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-hr-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "2a3f3fedd55edf9164b1fa044f4c3b2e2128e5bd148f2189f59f40bd78fc20d35bf791cb804bf146385ebd697f15f9dd44638b5fb87d34816aa3f9fbf0fa8a11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:hr) \
yast2-trans-hr"

RDEPENDS:${PN} += ""

inherit rpm
