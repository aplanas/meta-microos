SUMMARY = "YaST2 - Macedonian Translations"
DESCRIPTION = "YaST2 - Translations for Macedonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-mk-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "3218d7c0de4413b1ad2012559aa79bbd5bf6d4ef4929a1edf0dac3c3e28cb080b784ef92b5a0d2d8a43aa2259a12cdacced7d283bd0a6bd3ff829beae8e2a8e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-mk \
yast2-trans-mk"

RDEPENDS:${PN} += ""

inherit rpm
