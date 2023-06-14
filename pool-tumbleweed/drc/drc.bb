SUMMARY = "Tools to generate digital room correction filters"
DESCRIPTION = "DRC is a program used to generate correction filters for acoustic compensation \
of HiFi and audio systems in general, including listening room compensation. DRC \
generates just the FIR correction filters, which can be used with a real time or \
offline convolver to provide real time or offline correction. DRC doesn't \
provide convolution features, and provides only some simplified, although really \
accurate, measuring tools."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.3"

RPM_NAME = "drc-3.2.3-1.14.aarch64.rpm"
RPM_HASH = "f2160547669ef72ea379c09bed5965b7250de052761796bcfc7b704776c58d782a09e59d6711898d3bc319c417c64218a722c5845a5b34afc235a7a3c69fdfdb"

RPROVIDES:${PN} += "drc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
