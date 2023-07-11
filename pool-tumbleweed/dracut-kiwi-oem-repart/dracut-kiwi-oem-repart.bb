SUMMARY = "KIWI - Dracut module for oem(repart) image type"
DESCRIPTION = "This package contains the kiwi-repart dracut module which is \
used to repartition the oem disk image to the current disk \
geometry according to the setup in the kiwi image configuration"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "dracut-kiwi-oem-repart-9.24.61-1.2.aarch64.rpm"
RPM_HASH = "3c9287c87bc67dac6cc82084b9a86eb475cf9fbbe0c9e4cab7c9c0e1a82673acd903ba58b9efeb08017d047c48775e8b4fccf323fcc81cc764734aca3ede644d"

RPROVIDES:${PN} += "dracut-kiwi-oem-repart"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut-kiwi-lib"

inherit rpm
