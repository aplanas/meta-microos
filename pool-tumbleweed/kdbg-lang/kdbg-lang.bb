SUMMARY = "Translations for package kdbg"
DESCRIPTION = "Provides translations for the 'kdbg' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "kdbg-lang-3.0.1-1.17.noarch.rpm"
RPM_HASH = "eeb0e99f07a0f0f0c2b986531421d655a8836a7ca7e3dae0f4c7e7d12ffc0375d478e3456852dafefd9375cac67a2eb0fdb014a02cea20b89d15de6fcba9daaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdbg-lang \
kdbg-lang-all \
locale-kdbg-cs \
locale-kdbg-da \
locale-kdbg-de \
locale-kdbg-es \
locale-kdbg-fr \
locale-kdbg-hr \
locale-kdbg-hu \
locale-kdbg-it \
locale-kdbg-ja \
locale-kdbg-nb \
locale-kdbg-nn \
locale-kdbg-pl \
locale-kdbg-pt \
locale-kdbg-ro \
locale-kdbg-ru \
locale-kdbg-sk \
locale-kdbg-sr \
locale-kdbg-sv \
locale-kdbg-tr \
locale-kdbg-zh-CN"

RDEPENDS:${PN} += "kdbg"

inherit rpm
