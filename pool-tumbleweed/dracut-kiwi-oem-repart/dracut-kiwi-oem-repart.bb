SUMMARY = "KIWI - Dracut module for oem(repart) image type"
DESCRIPTION = "This package contains the kiwi-repart dracut module which is \
used to repartition the oem disk image to the current disk \
geometry according to the setup in the kiwi image configuration"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "dracut-kiwi-oem-repart-9.24.61-1.1.aarch64.rpm"
RPM_HASH = "e942f3380ee09e9ac117bda4158c78be15173208cf70c0e0d57dc06d0aba5d915ef06b717ac88406e3086e13b45e323a824381c46dc4ea06a7c8773eec05caf1"

RPROVIDES:${PN} += "dracut-kiwi-oem-repart \
dracut-kiwi-oem-repart(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
dracut-kiwi-lib"

inherit rpm
