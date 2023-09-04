SUMMARY = "OpenRGB udev rules"
DESCRIPTION = "This package contain the udev rules for OpenRGB."
LICENSE = "GPL-2.0-only"

PV = "0.9"

RPM_NAME = "OpenRGB-udev-rules-0.9-1.1.noarch.rpm"
RPM_HASH = "3ffcac5ba0c92486233b6a9299fa5e22432e6130648eaf5379639043a561a81988f2706328aa08ec5456215f44be02feb2a2714e16010a122f2e655e15660d83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenRGB-udev-rules"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
