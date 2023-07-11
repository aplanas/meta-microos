SUMMARY = "A Probability Distribution Function Evolution Library"
DESCRIPTION = "APFEL is a library to perform the combined QCD+QED DGLAP \
evolution of parton distributions. \
 \
This package provides the shared libraries for apfel."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.6"

RPM_NAME = "libAPFEL0-3.0.6-1.19.aarch64.rpm"
RPM_HASH = "da5a9a955c79b79357e197b5008be661e3adfa31a554b53538c60f5505b082ccdb7203b4e45b17d2cdcd43f12afe8a7cc8aba897097fdd8c9af6b21f75554631"

RPROVIDES:${PN} += "libAPFEL.so.0 \
libAPFEL0 \
libAPFELevol.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
