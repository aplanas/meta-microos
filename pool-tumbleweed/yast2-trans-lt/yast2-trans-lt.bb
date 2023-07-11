SUMMARY = "YaST2 - Lithuanian Translations"
DESCRIPTION = "YaST2 - Translations for Lithuanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-lt-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "b198a2b2daf1677fe6d31b00605602fbcfe49b68c86ab04a8c3fd702619a79882681a119e6d439dd473d520bbc0fa999e9f78aa8ec69019404c3774f53dbb640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-lt \
yast2-trans-lt"

RDEPENDS:${PN} += ""

inherit rpm
