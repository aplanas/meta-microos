SUMMARY = "YaST2 - Gujarati Translations"
DESCRIPTION = "YaST2 - Translations for Gujarati."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-gu-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "6154cd65b0d52ff625cb648aa91b150b16f1feb9e0e78ab2d739fa832752208f05012eaab27bad1d1dc4a037ccd6670e3d3ba37722581b70a197b42392add4ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-gu \
yast2-trans-gu"

RDEPENDS:${PN} += ""

inherit rpm
