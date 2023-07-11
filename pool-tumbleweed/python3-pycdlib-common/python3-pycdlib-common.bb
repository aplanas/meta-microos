SUMMARY = "Pure python ISO manipulation library - common files"
DESCRIPTION = "PyCdlib is a pure python library to parse, write (master), and create ISO9660 \
files, suitable for writing to a CD or USB. \
 \
The original ISO9660 (including ISO9660-1999) specification is supported, as \
well the El Torito, Joliet, Rock Ridge, and UDF extensions. \
 \
This package includes the common files."
LICENSE = "LGPL-2.0-only"

PV = "1.14.0"

RPM_NAME = "python3-pycdlib-common-1.14.0-1.6.noarch.rpm"
RPM_HASH = "5850d23d03e4ce7f7e2913da0df5eb8f376adc65afb5b441992494ab90881c97031167e5ea0a1998b1c98d4bcbbff1cfcb61b105c3afbbd24fc777ddbf277fe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycdlib-common"

RDEPENDS:${PN} += ""

inherit rpm
