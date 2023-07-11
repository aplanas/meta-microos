SUMMARY = "Molecular Graphics Visualization Tool"
DESCRIPTION = "RasMol is an X Window System tool intended for the visualization of \
proteins and nucleic acids. It reads Brookhaven Protein Database (PDB) \
files and interactively renders them in a variety of formats on either \
an 8-bit or 24/32-bit color display. \
 \
Examples are in /usr/lib/rasmol."
LICENSE = "SUSE-Public-Domain"

PV = "2.7.4.2"

RPM_NAME = "rasmol-2.7.4.2-77.22.aarch64.rpm"
RPM_HASH = "3473ebf25765bee8cabdef43411932be9a9efb41dd08f0c59f62d74a3eae8b0e7577acca524bae9122fe130d565dc1613ea97183c613b83481375eafd5d59314"

RPROVIDES:${PN} += "RasMol \
rasmol"

RDEPENDS:${PN} += "/usr/bin/csh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
