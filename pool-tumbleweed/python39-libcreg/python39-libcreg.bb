SUMMARY = "Library to access Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "python39-libcreg-20210625-5.10.aarch64.rpm"
RPM_HASH = "990feee97df91620996b1d72d7c05d3acbc20205d3325c2db84e23b30791446328a9452fb7af6cf5c8fc8b1e4ffabf280e2a0e31c6e3fd317531c2868b4770aa"

RPROVIDES:${PN} += "python39-libcreg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcreg.so.1 \
python-abi"

inherit rpm
