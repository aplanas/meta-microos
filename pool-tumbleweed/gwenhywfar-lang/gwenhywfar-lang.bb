SUMMARY = "Translations for package gwenhywfar"
DESCRIPTION = "Provides translations for the 'gwenhywfar' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.10.1"

RPM_NAME = "gwenhywfar-lang-5.10.1-1.5.noarch.rpm"
RPM_HASH = "d31b5f144055dbfe0fd9980994e4e9641780408e47c87c7a6d6b67d63941344997cfdd970dd81dc6f369f56a7f0c267fbfc664df09b0647301be41a8c4f15cec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gwenhywfar-lang \
gwenhywfar-lang-all \
locale-gwenhywfar-de"

RDEPENDS:${PN} += "gwenhywfar"

inherit rpm
