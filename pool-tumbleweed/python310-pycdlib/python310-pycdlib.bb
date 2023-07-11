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

RPM_NAME = "python310-pycdlib-1.14.0-1.6.noarch.rpm"
RPM_HASH = "78b61c2dda3022e6a10ff580a33643a788ad2c459d8316c7e88ab5825d5bca80ab2036c0fca22ec1b495e2e10ca71df567c307172e6ea944d00075f1b1465351"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pycdlib \
python310-pycdlib \
python3dist-pycdlib"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
mkisofs \
python-abi \
python3-pycdlib-common"

inherit rpm
