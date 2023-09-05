SUMMARY = "KDE PIM Libraries: Text edit functionality"
DESCRIPTION = "This package contains the basic packages for KDE PIM applications, in \
particular those related to editing text, like email messages."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kpimtextedit-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "8d58596a8a2ff7512faa67bdf10fdbc897866c0358835c6b83f6bd99bf69eb05abbb94179a044c56a7545c9e754a81c43247c44ccb729235bce87aa57054f37c"

RPROVIDES:${PN} += "kpimtextedit"

RDEPENDS:${PN} += ""

inherit rpm
