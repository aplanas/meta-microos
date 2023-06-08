SUMMARY = "Logos for openSUSE Distros"
DESCRIPTION = "Logos for openSUSE Distributions"
LICENSE = "CC-BY-SA-4.0"

PV = "20220322"

RPM_NAME = "distribution-logos-openSUSE-20220322-1.5.noarch.rpm"
RPM_HASH = "3603f10ded72c3dca602b458528dd4765f2475ba2a88cedba8b59403f5163d41211fd9cea5e752ae9224a4857f6d0f30dd228416c13fd900de9d0ad8aa270049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distribution-logos-openSUSE"
RDEPENDS:${PN} += ""

inherit rpm
