SUMMARY = "Periodic table of elements in EFL"
DESCRIPTION = "Graphical application that display the periodic table of the elements. It shows \
basic data for each element, pictures, Bohr models and lattice structures."
LICENSE = "BSD-2-Clause"

PV = "0.5"

RPM_NAME = "eperiodique-0.5-3.34.aarch64.rpm"
RPM_HASH = "a1819843084826309b412e0162f5e954952b241d893d4753ac5bc9f4d0a899a9e32464d27d4d161b00366f5978a480cb20e47a011128f71e1a7b67884245265e"

RPROVIDES:${PN} += "eperiodique"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libecore.so.1 \
libedje.so.1 \
libeina.so.1 \
libelementary.so.1 \
libevas.so.1"

inherit rpm
