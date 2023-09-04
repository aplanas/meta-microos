SUMMARY = "Slimline Open Firmware - SLOF"
DESCRIPTION = "Slimline Open Firmware (SLOF) is an implementation of the IEEE 1275 standard. \
It can be used as partition firmware for pSeries machines running on QEMU or KVM."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-SLOF-8.0.4-1.1.noarch.rpm"
RPM_HASH = "233724402aca509b2d60439add4097336b397ed7f2b6e9b502d9acbd99bcf94f8f097f0841108fb961b56abeec250104b453808c8796befd8957949097583849"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-SLOF"

RDEPENDS:${PN} += ""

inherit rpm
