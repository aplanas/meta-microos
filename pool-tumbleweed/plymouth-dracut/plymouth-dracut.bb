SUMMARY = "Plymouth related utilities for dracut"
DESCRIPTION = "This package contains utilities that integrate dracut with Plymouth"
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-dracut-22.02.122+94.4bd41a3-6.1.noarch.rpm"
RPM_HASH = "26f2e9a85d569bc4eb0b1263102dd89c590331643bab2862700d273553385bb0b4ced49f4447833a8b719711a282f514adc1474d2fdf4ef860a006009f91b55c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-dracut"

RDEPENDS:${PN} += "/usr/bin/bash \
plymouth"

inherit rpm
