SUMMARY = "YaST2 - Marathi Translations"
DESCRIPTION = "YaST2 - Translations for Marathi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-mr-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "261e731dfcf3f637a8eefa327592653365fccda69203ce3968ade23e5cd65b62495a543815d7f2511b1d5b726a3be77f07d7089c31ce4fee9273be1cba32484c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-mr \
yast2-trans-mr"

RDEPENDS:${PN} += ""

inherit rpm
