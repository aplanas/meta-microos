SUMMARY = "Numix Common Theme Files"
DESCRIPTION = "Numix is a modern flat theme with a combination of light and dark \
elements. It supports MATE, GNOME, Xfce, and Openbox. \
This package contains common files and themes for Marco, Openbox, \
and Xfwm4."
LICENSE = "GPL-3.0-or-later"

PV = "2.6.7.1617863126.0d6b4c8"

RPM_NAME = "metatheme-numix-common-2.6.7.1617863126.0d6b4c8-2.6.noarch.rpm"
RPM_HASH = "e2f2390b9eac85d1cadb77ea8308aa23bffbf95fc9a104ad61a36c8a2b93dbeebe397a6c8a09c64d4257e8b5d37000a5aa91ded48de7fcd08e9202898ba3a0ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-numix-common"

RDEPENDS:${PN} += ""

inherit rpm
