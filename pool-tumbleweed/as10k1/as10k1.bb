SUMMARY = "Emu10k1 DSP assembler"
DESCRIPTION = "Assmbler for emu10k1 DSP chip present in Creative SB Live, PCI 512 and \
Emu APS sound cards."
LICENSE = "GPL-2.0-or-later"

PV = "A0.99"

RPM_NAME = "as10k1-A0.99-24.3.aarch64.rpm"
RPM_HASH = "87d31c83e396fcbbf6fbb5016991764536bd71442c1fd8977362703ec7212ffe5994d9891c00fbb2ffc0615c2178aad37e41b7277c49c43874c463e0b000a0a0"

RPROVIDES:${PN} += "alsa-tools \
as10k1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
