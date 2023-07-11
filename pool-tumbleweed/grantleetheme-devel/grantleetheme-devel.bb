SUMMARY = "Development package for grantleetheme"
DESCRIPTION = "The development package for the grantleetheme library"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "grantleetheme-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "4bfe62138f4b216906e200712c2d9ff79c4e89920d2f1d375dbc6cd3a56df3daec62665177aab007d34ca11ac33dfe0c1b1dfb9dfb8e89a883b2032e35e49bb1"

RPROVIDES:${PN} += "cmake-KF5GrantleeTheme \
cmake-KPim5GrantleeTheme \
grantleetheme-devel"

RDEPENDS:${PN} += "libKPim5GrantleeTheme5"

inherit rpm
