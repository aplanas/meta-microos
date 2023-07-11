SUMMARY = "FDO Icon theme to go with openSUSE Enlightenment Theme"
DESCRIPTION = "An FDO Icon theme that matches the one used by the openSUSE Enlightenment \
theme"
LICENSE = "GPL-3.0-only"

PV = "20220430.1.26"

RPM_NAME = "openSUSE-e-X-Icons-20220430.1.26-1.11.noarch.rpm"
RPM_HASH = "9eb7a76f6d89d28c1c3946c68e08198899d261362afffa56b58867b6682763ec76e1c4e2436a4e26c45f70a239d25e5a74996b6c90d87d148b22f57dad775e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openSUSE-e-X-Icons"

RDEPENDS:${PN} += ""

inherit rpm
