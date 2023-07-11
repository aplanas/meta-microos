SUMMARY = "YaST2 - Swedish Translations"
DESCRIPTION = "YaST2 - Translations for Swedish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-sv-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "7c095631132829cf0147e49061db6d76f0202da90576befde13d8ee5df6f3c609605859df622379a018c1adcb9e85bc70a7c4ae722cf80b56f6509a8827f4336"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sv \
yast2-trans-sv"

RDEPENDS:${PN} += ""

inherit rpm
