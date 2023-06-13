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

RPM_NAME = "python3-pycdlib-common-1.14.0-1.4.noarch.rpm"
RPM_HASH = "bc1756b1d898fe9358c6e5f4aa9f7b2eee936a7f54706842e12159795aea932618251ac52835dcc6fbf99afdb4fdebe3102a7c4b796cde85478ed81d6277132c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycdlib-common"

RDEPENDS:${PN} += ""

inherit rpm
