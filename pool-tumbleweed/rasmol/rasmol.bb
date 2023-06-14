SUMMARY = "Molecular Graphics Visualization Tool"
DESCRIPTION = "RasMol is an X Window System tool intended for the visualization of \
proteins and nucleic acids. It reads Brookhaven Protein Database (PDB) \
files and interactively renders them in a variety of formats on either \
an 8-bit or 24/32-bit color display. \
 \
Examples are in /usr/lib/rasmol."
LICENSE = "SUSE-Public-Domain"

PV = "2.7.4.2"

RPM_NAME = "rasmol-2.7.4.2-77.21.aarch64.rpm"
RPM_HASH = "2d1e0bd04a55a87ee8661d80af5b9871ab1a8d624431062262b6d22afb43d63365f0ee8b87d37bf3be3a5a61d3a10c5fe64a533aee6036348001a979daaa2ebb"

RPROVIDES:${PN} += "RasMol \
rasmol"

RDEPENDS:${PN} += "/bin/csh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
