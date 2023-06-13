SUMMARY = "YaST2 - Persian Translations"
DESCRIPTION = "YaST2 - Persian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-fa-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "20412a373329a2798a6dc288f412982e39a8b30e9f193ae5d47d28b1cd65e3611504dcdc6da4d74bd7b5f69e09a807c3ccf76d1a6606a605868da0931eba4542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:fa) \
yast2-trans-fa"

RDEPENDS:${PN} += ""

inherit rpm
