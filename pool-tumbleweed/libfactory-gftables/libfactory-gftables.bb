SUMMARY = "G_F tables for Singular/libfactory"
DESCRIPTION = "Factory is a C++ class library that implements a recursive \
representation of multivariate polynomial data. \
 \
This package contains the G_F tables."
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libfactory-gftables-4.3.1.p3-1.4.noarch.rpm"
RPM_HASH = "6fcb62bed07a1bebc5035f9cde7b791b9295611e3443141d00a52c8e444c19f529e3f4dffe5255c6b1cf17eff13bb8e5ce51231a950649196c084e3c131fa428"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfactory-gftables"

RDEPENDS:${PN} += ""

inherit rpm
