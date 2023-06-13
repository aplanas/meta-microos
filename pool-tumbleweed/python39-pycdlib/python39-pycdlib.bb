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

RPM_NAME = "python39-pycdlib-1.14.0-1.4.noarch.rpm"
RPM_HASH = "8932d13aacb8a0b9a32019328b5eaae25d8c390550421655ef4fa7fd0fa6bde599dd007881b9aa06685dc31d154065300f8062cae701c2678d0ee642c8a96d30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pycdlib) \
python39-pycdlib \
python3dist(pycdlib)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
mkisofs \
python(abi) \
python3-pycdlib-common"

inherit rpm
