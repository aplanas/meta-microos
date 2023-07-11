SUMMARY = "Slimline Open Firmware - SLOF"
DESCRIPTION = "Slimline Open Firmware (SLOF) is an implementation of the IEEE 1275 standard. \
It can be used as partition firmware for pSeries machines running on QEMU or KVM."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-SLOF-8.0.2-2.1.noarch.rpm"
RPM_HASH = "a99064555d81f38ab30bb6ab6f8d6a5ffcff29cc5541b889cd792740af09589bcbb491ba04857267b8dd72db5a13946f418327aea3138fec1ab86f1f570d4294"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-SLOF"

RDEPENDS:${PN} += ""

inherit rpm
