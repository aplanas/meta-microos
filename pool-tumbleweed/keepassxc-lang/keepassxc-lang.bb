SUMMARY = "Translations for package keepassxc"
DESCRIPTION = "Provides translations for the 'keepassxc' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.7.5"

RPM_NAME = "keepassxc-lang-2.7.5-1.1.noarch.rpm"
RPM_HASH = "b21561e195ced810d07391b303c30c7f84061352f28feddfd20275380d93c6553b7190d53e116d4cd6c9c453c7e35e4fbd0d04ceaf402966616235178f7c300f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keepassxc-lang \
keepassxc-lang-all"

RDEPENDS:${PN} += "keepassxc"

inherit rpm
