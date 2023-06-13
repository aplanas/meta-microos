SUMMARY = "Translations for package qlipper"
DESCRIPTION = "Provides translations for the 'qlipper' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.2"

RPM_NAME = "qlipper-lang-5.1.2-1.12.noarch.rpm"
RPM_HASH = "eecf4a38dca458ee29f835965988e05a0ef225c6da568a5db9442bbf8c860980902bda0245b86aa3ff5f1a2049321a175d31406d299adda72cb9188caaf3a2fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qlipper-lang \
qlipper-lang-all"

RDEPENDS:${PN} += "qlipper"

inherit rpm
