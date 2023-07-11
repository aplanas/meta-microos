SUMMARY = "Emu10k1 DSP assembler"
DESCRIPTION = "Assmbler for emu10k1 DSP chip present in Creative SB Live, PCI 512 and \
Emu APS sound cards."
LICENSE = "GPL-2.0-or-later"

PV = "A0.99"

RPM_NAME = "as10k1-A0.99-24.4.aarch64.rpm"
RPM_HASH = "662ade6a58996d92074972b2d020c6647f65493bfb50e641bf1ce7f82625e9aad64d926e9286b1668f08fc368724281c44a18f761dc7dd0b1383e290950a1ecb"

RPROVIDES:${PN} += "alsa-tools \
as10k1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
