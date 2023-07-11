SUMMARY = "Library to access Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "python39-libcreg-20210625-5.9.aarch64.rpm"
RPM_HASH = "7a0e5d403870c812b255baa35c24e99047f6cde06b56b3b08ee6f966959ac2bacfc12c8a879bd9491fbae6fce4320467fed22eef1fd19851e57062032173a407"

RPROVIDES:${PN} += "python39-libcreg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcreg.so.1 \
python-abi"

inherit rpm
