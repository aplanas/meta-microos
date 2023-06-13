SUMMARY = "Translations for package solarus-quest-editor"
DESCRIPTION = "Provides translations for the 'solarus-quest-editor' package."
LICENSE = "GPL-3.0-or-later & CC-BY-SA-3.0"

PV = "1.6.2"

RPM_NAME = "solarus-quest-editor-lang-1.6.2-2.1.noarch.rpm"
RPM_HASH = "2f55b4bb7fb81f09935e6c6022094e1a795e8eeb1481aef786235fe1e86aaa8732960adf6402ba47a6d61e607c2d8965790b5a57ae0e6f81ba144a2d705c127b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "solarus-quest-editor-lang \
solarus-quest-editor-lang-all"

RDEPENDS:${PN} += "solarus-quest-editor"

inherit rpm
