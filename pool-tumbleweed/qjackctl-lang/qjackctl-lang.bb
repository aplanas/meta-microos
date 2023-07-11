SUMMARY = "Translations for package qjackctl"
DESCRIPTION = "Provides translations for the 'qjackctl' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.10"

RPM_NAME = "qjackctl-lang-0.9.10-1.2.noarch.rpm"
RPM_HASH = "69f2d62dd55901d644b7fbf210c9da70915646ddbd583bcb7e8837259bee255fcf80f06972e4f0c49d8b33ae857362aa1bfa894360f159c0793cc9cff70b09ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qjackctl-lang \
qjackctl-lang-all"

RDEPENDS:${PN} += "qjackctl"

inherit rpm
