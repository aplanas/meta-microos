SUMMARY = "Development package for grantleetheme"
DESCRIPTION = "The development package for the grantleetheme library"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "grantleetheme-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "9a1b0054977966a87d0b8f5a0569e26b2dc9d4d2e418b0e292b85019afca9a0763f1e8ce2b62015b887e5458215aea4acafe033dd02e3608508e9d449cca1194"

RPROVIDES:${PN} += "cmake-KF5GrantleeTheme \
cmake-KPim5GrantleeTheme \
grantleetheme-devel"

RDEPENDS:${PN} += "libKPim5GrantleeTheme5"

inherit rpm
