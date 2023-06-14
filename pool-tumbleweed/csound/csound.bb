SUMMARY = "Computer Sound Synthesis and Composition Program"
DESCRIPTION = "Csound is a software synthesis program. It is modular and \
supports an unlimited amount of oscillators and filters."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "csound-6.18.1-3.1.aarch64.rpm"
RPM_HASH = "28fe37cbfa3bc2f82065523c10921b708a7f1a0aab0e8d3eacd7b36d069d84464125c79011a2043a2f56bab4c42f48518b1781d387f1de16e3854ca2eea53f37"

RPROVIDES:${PN} += "csound"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcsound64.so.6.0 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
