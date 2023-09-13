SUMMARY = "YaST2 - Persian Translations"
DESCRIPTION = "YaST2 - Persian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-fa-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "8f1141cec6d0454b8362d0bc59f212ce885a485a5d792c60d283e3e523166eee0ef3e97c6aed29d1428d926b5e8144c7f1eb53776794b660b5756a75ce195acf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-fa \
yast2-trans-fa"

RDEPENDS:${PN} += ""

inherit rpm
