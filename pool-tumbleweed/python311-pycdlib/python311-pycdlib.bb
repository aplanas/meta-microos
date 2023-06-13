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

RPM_NAME = "python311-pycdlib-1.14.0-1.4.noarch.rpm"
RPM_HASH = "3b955ada839f565bec372a20f05db797d16b1866ce7b80641ae9d27f03f9aee4d1e5f8c5ca05052587f309f53d5c5c97377d7cb8b70ed4086ed495421764c45e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pycdlib) \
python311-pycdlib \
python3dist(pycdlib)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
mkisofs \
python(abi) \
python3-pycdlib-common"

inherit rpm
