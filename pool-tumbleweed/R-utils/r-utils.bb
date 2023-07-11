SUMMARY = "Package providing R-utils"
DESCRIPTION = "This package provides R-utils, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "R-utils-4.3.1-46.1.aarch64.rpm"
RPM_HASH = "12a1099a4dfc0f548130bc09b15c50f5e13874cfe3e459b4ccab7eb8c244538b364e85e425365670b2906a5482e723fab7e43afaf89a6ecd80ea0078581aa237"

RPROVIDES:${PN} += "R-utils"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
