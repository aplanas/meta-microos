SUMMARY = "YaST2 - Croatian Translations"
DESCRIPTION = "YaST2 - Croatian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-hr-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "af8ed691ace6ca294331258e5c429f330e43299c5410134cfd5caf3d5ebf0d1213190f1e9d38374d08c5e0eea32780c3b58d91af01e2455c006e62d0376cd95c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-hr \
yast2-trans-hr"

RDEPENDS:${PN} += ""

inherit rpm
