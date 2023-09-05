SUMMARY = "Development package for grantleetheme"
DESCRIPTION = "The development package for the grantleetheme library"
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "grantleetheme-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "577bc34c1d0c24b0b39d67366b914ef3ab9a90fb41ec86db8f212ce4171374963303373ec1d37afdb1b8fb71ee877763269c5b19448ccc2c45dc14d37e7cd3e6"

RPROVIDES:${PN} += "cmake-KPim5GrantleeTheme \
grantleetheme-devel"

RDEPENDS:${PN} += "libKPim5GrantleeTheme5"

inherit rpm
