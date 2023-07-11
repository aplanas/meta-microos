SUMMARY = "Molecular Graphics Visualization Tool"
DESCRIPTION = "Garlic is an X Window System tool intended for the molecular \
visualization of protein structure, DNA structure, and biological \
macromolecules. It reads Brookhaven Protein Database (PDB) files."
LICENSE = "LGPL-2.1+"

PV = "1.6"

RPM_NAME = "garlic-1.6-221.21.aarch64.rpm"
RPM_HASH = "c0743ab1cd4ea63638544ffaf60b318d87d660d4076b68ea83918b5b7132b2053d2e4090127d20f7f5983c129ad5df1ad44b7780502255fbf1147c85248f71a3"

RPROVIDES:${PN} += "config-garlic \
garlic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
