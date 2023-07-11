SUMMARY = "Development files for espeak-ng"
DESCRIPTION = "This package contains development files for espeak-ng."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-3.0-or-later & Unicode-DFS-2015"

PV = "1.51"

RPM_NAME = "espeak-ng-devel-1.51-1.9.aarch64.rpm"
RPM_HASH = "3fecbc1fbbc90aea775d31e1b9f3884df713199bfed808f9fa5854f85685076dd6ae8567396f8948a3a02a65cd11a3823c672a86e22fb6edcce0690e1b3efff2"

RPROVIDES:${PN} += "espeak-ng-devel \
pkgconfig-espeak-ng"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libespeak-ng1"

inherit rpm
