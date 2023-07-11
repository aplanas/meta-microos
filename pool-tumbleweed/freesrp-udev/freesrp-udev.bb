SUMMARY = "Udev rules for FreeSRP"
DESCRIPTION = "Udev rules for FreeSRP SDR hardware"
LICENSE = "GPL-3.0"

PV = "0.3.0"

RPM_NAME = "freesrp-udev-0.3.0-1.28.aarch64.rpm"
RPM_HASH = "8194782a89d9bdf3802d579ab92c572a24e7468b30799c2a350ecfebd21c81b84011aaab829f946059df984894577e946262d27a29a066153784de65aefaa93c"

RPROVIDES:${PN} += "freesrp-udev"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
