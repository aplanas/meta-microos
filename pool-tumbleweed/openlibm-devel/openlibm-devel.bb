SUMMARY = "Development files for openlibm"
DESCRIPTION = "OpenLibm is an implementation of a standalone C mathematical library \
(libm). It can be used standalone in applications and programming \
language implementations. \
 \
This package provides libraries and header files for developing applications \
that use OpenLIBM."
LICENSE = "BSD-2-Clause & MIT"

PV = "0.8.1"

RPM_NAME = "openlibm-devel-0.8.1-1.4.aarch64.rpm"
RPM_HASH = "a04ffd1ebfd18faba10217214e9108c9756a3da6c56a90515bda07143378550a473a05152e07a183fd792f1f1a42d95ff431f85dd7e6d69cd43dd749ce566615"

RPROVIDES:${PN} += "openlibm-devel \
pkgconfig-openlibm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenlibm4"

inherit rpm
