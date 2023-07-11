SUMMARY = "YaST2 - Estonian Translations"
DESCRIPTION = "YaST2 - Translations for Estonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-et-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "fea022014c658de710e060b3f3a5f0a00a4274764de1ee1e7c5ba4cd8b4af71112ef917e6b0e4e2f26627a5f624fc8874e106d9df431da41c2152c48d09b8312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-et \
yast2-trans-et"

RDEPENDS:${PN} += ""

inherit rpm
