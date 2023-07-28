SUMMARY = "YaST2 - Albanian Translations"
DESCRIPTION = "YaST2 - Translations for Albanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-sq-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "b676050f12330383c128e78468ad42fea5bc8f31a2ef4f68039a92d4800b0285a80367b7f533215dc92fbd5dbc20bef47c7df9e0551ed4e5ebf7c53d8777babc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sq \
yast2-trans-sq"

RDEPENDS:${PN} += ""

inherit rpm
