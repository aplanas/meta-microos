SUMMARY = "Development package for libgravatar"
DESCRIPTION = "The development package for the libgravatar library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libgravatar-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "fde9f5a06cb128ed8cd047bc9bf4b72f671e675bfefa02a9be4fb7d75a5ef5ff173da5d6c10b77e483bfebcae5a7a931300b5365a50bab554f73f544a6d40392"

RPROVIDES:${PN} += "cmake-KF5Gravatar \
cmake-KPim5Gravatar \
libgravatar-devel"

RDEPENDS:${PN} += "libKPim5Gravatar5"

inherit rpm
