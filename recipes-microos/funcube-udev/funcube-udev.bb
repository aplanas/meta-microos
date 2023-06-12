SUMMARY = "Udev rules for FCD and FCDpro Plus devices"
DESCRIPTION = "Udev rules for FCD and FCDpro Plus devices."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "funcube-udev-3.10.0.rc3-1.1.noarch.rpm"
RPM_HASH = "410e3974c332800644f3a9a976207d0b3aded4dcfab0f171834e3070848cce46a44cb8964d9e028b32b12864a0bef4c0fd1d7da4b2fbbc9c9c2b42067033f249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "funcube-udev"
RDEPENDS:${PN} += "/bin/sh \
shadow"

inherit rpm
