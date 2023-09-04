SUMMARY = "Library to access Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "python39-libcreg-20210625-6.1.aarch64.rpm"
RPM_HASH = "c91acc46dba62ebc9d7461ac8aad5d5594afce46860c09596836b47d1ff82e3bac8d2e4bc62452fc4231aae48b6360949bcc4a8af34a1e231c8d1fff47504901"

RPROVIDES:${PN} += "python39-libcreg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcreg.so.1 \
python-abi"

inherit rpm
