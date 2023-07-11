SUMMARY = "Executables compatible with the original espeak"
DESCRIPTION = "This package contains executables compatible with the original espeak."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-3.0-or-later & Unicode-DFS-2015"

PV = "1.51"

RPM_NAME = "espeak-ng-compat-1.51-1.9.aarch64.rpm"
RPM_HASH = "766d38f4b31bbfaf73c1167493f4fc4ee1a293e73e79852d6d276080cf041830750b04ba71ab9621e492ab2223c118da6ca8e6baa019135998259445fae4fd08"

RPROVIDES:${PN} += "espeak-ng-compat"

RDEPENDS:${PN} += "espeak-ng"

inherit rpm
