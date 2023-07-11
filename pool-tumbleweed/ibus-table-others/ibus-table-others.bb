SUMMARY = "Other non-Chinese tables for ibus"
DESCRIPTION = "This package contains all other non-Chinese tables for ibus e.g. CNS11643, \
Compose, Emoji, Ipx-x-sampa, Latex, Rustrad, Thai, Translit-ua, Translit, Viqr, \
Yawerty. This package contains only COPYING and Documents, Please select the \
table you want to use."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.16"

RPM_NAME = "ibus-table-others-1.3.16-1.1.noarch.rpm"
RPM_HASH = "7755f4de00ba5d22cca5d95fab250b7cf932eaf6f5e69930208d2a0ae3626df44c1d0eb1ca614c5035df276d4457bec0d42b5ea3f2b93a3ca5deee2ee86e088a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-others"

RDEPENDS:${PN} += ""

inherit rpm
