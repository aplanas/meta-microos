SUMMARY = "Library to access Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "python310-libcreg-20210625-6.1.aarch64.rpm"
RPM_HASH = "08dd40685afb4b1caf7d5ff7fa4c57fd3a7e475238b9133d371a3f265e0b901ad301d8ef45d33b5b1acb4d4b1434e9a48b81f6b3f324f361ce1b861f41c937a7"

RPROVIDES:${PN} += "python310-libcreg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcreg.so.1 \
python-abi"

inherit rpm
