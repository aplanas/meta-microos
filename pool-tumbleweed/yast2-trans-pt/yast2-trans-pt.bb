SUMMARY = "YaST2 - Portuguese Translations"
DESCRIPTION = "YaST2 - Translations for Portuguese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-pt-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "5e39d66edf64a2d34fbe77b7d4784ba822f26c81379a3ce20e471c79e78dfae9aa70e5769a33be289282af269eb7a99b15a25570cade42e3b5c22118cc82d9f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pt \
yast2-trans-pt"

RDEPENDS:${PN} += ""

inherit rpm
