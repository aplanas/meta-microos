SUMMARY = "Molecular Graphics Visualization Tool"
DESCRIPTION = "Garlic is an X Window System tool intended for the molecular \
visualization of protein structure, DNA structure, and biological \
macromolecules. It reads Brookhaven Protein Database (PDB) files."
LICENSE = "LGPL-2.1+"

PV = "1.6"

RPM_NAME = "garlic-1.6-221.20.aarch64.rpm"
RPM_HASH = "6f07a8d9dac440b1145164b11b60ccd4bfd1fecc8ce637db4d3cbdc6f8fd4fb541bd4e51f1a6e3baac5f91bb81069d53dffe5860a497eb7f33aed6e9fc7b477b"

RPROVIDES:${PN} += "config-garlic \
garlic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
