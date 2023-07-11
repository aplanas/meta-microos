SUMMARY = "YaST2 - Macedonian Translations"
DESCRIPTION = "YaST2 - Translations for Macedonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-mk-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "0c03715f716f1a9ef0b26e7416b961527fe9c1fcc0af1f04bae0d2905ff07a71c3eac737c6191b545819db82e0d8b09a0ebb945a4c5409a525e3bd777277b9e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-mk \
yast2-trans-mk"

RDEPENDS:${PN} += ""

inherit rpm
