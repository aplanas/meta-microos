SUMMARY = "YaST2 - Brazilian Portuguese Translations"
DESCRIPTION = "YaST2 - Translations for Brazilian Portuguese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-pt_BR-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "bde732c17ff4460440953770723584510dbcc576885a0bd82a70783c17941f4891be8e19330e6ec6c2b085635a06e62a0e7faccc0f79fc81e4f8d647146fad47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pt-BR \
yast2-trans-pt-BR"

RDEPENDS:${PN} += ""

inherit rpm
