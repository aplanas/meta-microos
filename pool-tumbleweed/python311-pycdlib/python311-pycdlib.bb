SUMMARY = "Pure python ISO manipulation library"
DESCRIPTION = "PyCdlib is a pure python library to parse, write (master), and create ISO9660 \
files, suitable for writing to a CD or USB. \
 \
The original ISO9660 (including ISO9660-1999) specification is supported, as \
well the El Torito, Joliet, Rock Ridge, and UDF extensions. \
 \
Please see https://clalancette.github.io/pycdlib/ for much more documentation"
LICENSE = "LGPL-2.0-only"

PV = "1.14.0"

RPM_NAME = "python311-pycdlib-1.14.0-1.6.noarch.rpm"
RPM_HASH = "7952b9e5f21caaea30d17eac7913701d05fd90cbc2f86a91798db034d68b849e8eedee19a0a7eaec753df2edd4e795adc365e0a417c03fef4e0200f0e716ba9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycdlib \
python3.11dist-pycdlib \
python311-pycdlib \
python3dist-pycdlib"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
mkisofs \
python-abi \
python3-pycdlib-common"

inherit rpm
