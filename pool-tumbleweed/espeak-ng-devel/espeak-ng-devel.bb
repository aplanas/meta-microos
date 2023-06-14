SUMMARY = "Development files for espeak-ng"
DESCRIPTION = "This package contains development files for espeak-ng."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-3.0-or-later & Unicode-DFS-2015"

PV = "1.51"

RPM_NAME = "espeak-ng-devel-1.51-1.8.aarch64.rpm"
RPM_HASH = "8b1afd4fc5f09b169b28c053db138569a98e2c628429ec51d11fa35a79f3db66cd0fa7eb4ebf7479b01e0bbcc98ebd19ebb608967d94991df6a37a311c4deb7f"

RPROVIDES:${PN} += "espeak-ng-devel \
pkgconfig-espeak-ng"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libespeak-ng1"

inherit rpm
