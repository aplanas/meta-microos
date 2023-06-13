SUMMARY = "G_F tables for Singular/libfactory"
DESCRIPTION = "Factory is a C++ class library that implements a recursive \
representation of multivariate polynomial data. \
 \
This package contains the G_F tables."
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libfactory-gftables-4.3.1.p3-1.3.noarch.rpm"
RPM_HASH = "9712d984880493af4a5b8dde544d5d3b3464bd420a498adc25185987de76ccaba94d0052efaacf4771a93655746e4606c00a1a915e76dfdacf810bc76c48955c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfactory-gftables"

RDEPENDS:${PN} += ""

inherit rpm
