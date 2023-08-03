SUMMARY = "Slimline Open Firmware - SLOF"
DESCRIPTION = "Slimline Open Firmware (SLOF) is an implementation of the IEEE 1275 standard. \
It can be used as partition firmware for pSeries machines running on QEMU or KVM."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-SLOF-8.0.3-2.1.noarch.rpm"
RPM_HASH = "45f2f127af68562183441d29f928aba6222d97d64eaabb56c8253a8000294fae0e7b602ec11c654b3fa6c42345c40f45377e0b882e2fffedcf133ad5d3e49451"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-SLOF"

RDEPENDS:${PN} += ""

inherit rpm
