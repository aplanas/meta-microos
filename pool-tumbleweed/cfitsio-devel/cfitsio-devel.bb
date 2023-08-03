SUMMARY = "Headers required when building programs against cfitsio library"
DESCRIPTION = "This package contains headers required when building programs against cfitsio \
library."
LICENSE = "ISC"

PV = "4.3.0"

RPM_NAME = "cfitsio-devel-4.3.0-1.1.aarch64.rpm"
RPM_HASH = "5001933ee43dad7f8a359cfee0d8162c21e6432bcc7b09107b9460b5c27ee7937bc83b70022de37ff72fbaf74d7c5da482bdb001b11fc682fadaebe1c6b2e715"

RPROVIDES:${PN} += "cfitsio-devel \
pkgconfig-cfitsio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcfitsio10"

inherit rpm
