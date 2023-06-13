SUMMARY = "Documentation and Headers for chmlib"
DESCRIPTION = "This package contains the headers and documentation for the chmlib API \
that programmers will need to develop applications which use chmlib, \
the software library for dealing with Microsoft ITSS/CHM format files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.40"

RPM_NAME = "chmlib-devel-0.40-24.8.aarch64.rpm"
RPM_HASH = "9c7e6b601997077b9c1a0b38ff919d118cc2637f68f364219491b9a3ea6c52f317e3fc889991886515b7551bfdcb3da3e1eac4f1f6f05df4130d163e3a2c1ad5"

RPROVIDES:${PN} += "chmlib-devel \
chmlib-devel(aarch-64)"

RDEPENDS:${PN} += "libchm0"

inherit rpm
