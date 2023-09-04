SUMMARY = "KIWI - Dracut module for oem(repart) image type"
DESCRIPTION = "This package contains the kiwi-repart dracut module which is \
used to repartition the oem disk image to the current disk \
geometry according to the setup in the kiwi image configuration"
LICENSE = "GPL-3.0-or-later"

PV = "9.25.12"

RPM_NAME = "dracut-kiwi-oem-repart-9.25.12-1.1.aarch64.rpm"
RPM_HASH = "45a554912f83bcbf1dcbf654c12688274c367197c1fdf8e9d76cf2f8a88c07fbd464afd709d1142ae50dd0f2e60a1ca1f5a65f24c60097f49aec0dc0b07cc039"

RPROVIDES:${PN} += "dracut-kiwi-oem-repart"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut-kiwi-lib"

inherit rpm
