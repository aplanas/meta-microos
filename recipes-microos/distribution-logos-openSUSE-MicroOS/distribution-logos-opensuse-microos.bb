SUMMARY = "Logos for openSUSE MicroOS"
DESCRIPTION = "Logos for openSUSE MicroOS"
LICENSE = "CC-BY-SA-4.0"

PV = "20220322"

RPM_NAME = "distribution-logos-openSUSE-MicroOS-20220322-1.5.noarch.rpm"
RPM_HASH = "12cfeb254527b43bbe9e7f9735decfaff0efcd35ceedfdc274424434b4d57ea506218405a8e06e4af903780f52d725b19e6c22418fa5b3445a8fe4f72f15fcdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distribution-logos \
distribution-logos-openSUSE-MicroOS"
RDEPENDS:${PN} += ""

inherit rpm
