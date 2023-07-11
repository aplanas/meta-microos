SUMMARY = "Translations for package nitrogen"
DESCRIPTION = "Provides translations for the 'nitrogen' package."
LICENSE = "GPL-2.0-only & CC-BY-SA-3.0"

PV = "1.6.1"

RPM_NAME = "nitrogen-lang-1.6.1-1.23.noarch.rpm"
RPM_HASH = "5dd207bb7f04a9a801779abc726a5b679fe6b5227efb7329d3210e8320e2f7bbb2c7db5dc220a5f92e594432296683b841e111925a11b80bf1af87bf3ca5a0fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-nitrogen-bs \
locale-nitrogen-fi \
locale-nitrogen-hr \
locale-nitrogen-pl \
locale-nitrogen-ru \
locale-nitrogen-sr \
nitrogen-lang \
nitrogen-lang-all"

RDEPENDS:${PN} += "nitrogen"

inherit rpm
