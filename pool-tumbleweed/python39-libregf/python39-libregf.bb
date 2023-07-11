SUMMARY = "Library to access Windows REGF-type Registry files"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "python39-libregf-20230319-1.5.aarch64.rpm"
RPM_HASH = "464d2dd478fdb24cb05cbf719cc8154fa845eb4f86b680c94cb8e499ad4544b7f754a78fefa398a5e62987560036af574ddbda448e3cf6f9dfa791d078604fe6"

RPROVIDES:${PN} += "python39-libregf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libregf.so.1 \
python-abi"

inherit rpm
