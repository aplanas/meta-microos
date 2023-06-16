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

RPM_NAME = "python310-pycdlib-1.14.0-1.4.noarch.rpm"
RPM_HASH = "2b867f73c8b4bd4d73fcd9560acd5300c6ed4cc19b51ba6a767ed6d9d9ec764ad8000d8953710e4f806439643fc7bdc0eccf1966e57b4d792ea7a04b6a9b244a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycdlib \
python3.10dist-pycdlib \
python310-pycdlib \
python3dist-pycdlib"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
mkisofs \
python-abi \
python3-pycdlib-common"

inherit rpm
