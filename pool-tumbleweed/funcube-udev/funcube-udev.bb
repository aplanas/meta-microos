SUMMARY = "Udev rules for FCD and FCDpro Plus devices"
DESCRIPTION = "Udev rules for FCD and FCDpro Plus devices."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "funcube-udev-3.10.0.rc3-1.2.noarch.rpm"
RPM_HASH = "6da14b228b1dfc981587f9974f7dea4da50d4e1135dba07ca58d14705be2f84e38be7bbaa7eec3d60f3ae40097f9487ff874fbe3521ac4f6bab96be525749b1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "funcube-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow"

inherit rpm
