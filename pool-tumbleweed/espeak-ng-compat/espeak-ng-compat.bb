SUMMARY = "Executables compatible with the original espeak"
DESCRIPTION = "This package contains executables compatible with the original espeak."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-3.0-or-later & Unicode-DFS-2015"

PV = "1.51"

RPM_NAME = "espeak-ng-compat-1.51-1.8.aarch64.rpm"
RPM_HASH = "2133b2672c69c8c45bea7fbbf32c47927659a568f4a3eae04f0382830dd67c8f8bf678272fbe78a539c68dffa163e786fd5d57235a2458d6bc36bdcc7eccb6c3"

RPROVIDES:${PN} += "espeak-ng-compat"

RDEPENDS:${PN} += "espeak-ng"

inherit rpm
