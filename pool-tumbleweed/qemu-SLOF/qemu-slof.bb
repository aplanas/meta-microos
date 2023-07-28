SUMMARY = "Slimline Open Firmware - SLOF"
DESCRIPTION = "Slimline Open Firmware (SLOF) is an implementation of the IEEE 1275 standard. \
It can be used as partition firmware for pSeries machines running on QEMU or KVM."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-SLOF-8.0.3-1.1.noarch.rpm"
RPM_HASH = "2bcbabe05e8414ef1c4d63cb4e7e861b569f36ceec6dde11be504d8ba94cd7a0de161849a6bd7ef07a5425557f2125e7389454ca10bf80b6c19676f6ec30bbaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-SLOF"

RDEPENDS:${PN} += ""

inherit rpm
