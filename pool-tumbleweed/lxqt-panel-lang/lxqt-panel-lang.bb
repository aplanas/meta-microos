SUMMARY = "Translations for package lxqt-panel"
DESCRIPTION = "Provides translations for the 'lxqt-panel' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-panel-lang-1.3.0-1.2.noarch.rpm"
RPM_HASH = "5168f26c0dd5d9fd09a97d6d4451564cfe73b317e2f2a6e1a18c11ef6b50f84ddc320e7388aaff1715f9864a38bc014fed08df419a17bdf26e5da82b07b9ffe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-panel-lang \
lxqt-panel-lang-all"

RDEPENDS:${PN} += "lxqt-panel"

inherit rpm
