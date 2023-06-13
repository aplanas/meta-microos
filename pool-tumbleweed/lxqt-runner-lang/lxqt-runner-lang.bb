SUMMARY = "Translations for package lxqt-runner"
DESCRIPTION = "Provides translations for the 'lxqt-runner' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-runner-lang-1.3.0-1.1.noarch.rpm"
RPM_HASH = "be77483784d37636e1e3319351c414f96eead7c204fe7b9dc4517b3ba390bec02a42a6f4c0bc4314d4cd67ed7d2d7309a44bd4519174460be5ad5f8a2f9ee7cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-runner-lang \
lxqt-runner-lang-all"

RDEPENDS:${PN} += "lxqt-runner"

inherit rpm
