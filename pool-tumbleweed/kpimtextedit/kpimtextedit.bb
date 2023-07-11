SUMMARY = "KDE PIM Libraries: Text edit functionality"
DESCRIPTION = "This package contains the basic packages for KDE PIM applications, in \
particular those related to editing text, like email messages."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kpimtextedit-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "f215591855e4fa9d367340248584e1d9d5396be9d78e9d9b8ee4742ef635bf978c232ca520984ddf88f0248df45c809c57f55d3920be3495c0ade097020ee701"

RPROVIDES:${PN} += "kpimtextedit"

RDEPENDS:${PN} += ""

inherit rpm
