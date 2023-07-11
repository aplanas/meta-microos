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

RPM_NAME = "python39-pycdlib-1.14.0-1.6.noarch.rpm"
RPM_HASH = "40de796c66466b76c92d69fab016c710b8c43ef76e3b529e5b766fef3808e647fc30651938738ae9e81186531afa85976567d5c5566b6a3f281a98cd03ba37c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pycdlib \
python39-pycdlib \
python3dist-pycdlib"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
mkisofs \
python-abi \
python3-pycdlib-common"

inherit rpm
