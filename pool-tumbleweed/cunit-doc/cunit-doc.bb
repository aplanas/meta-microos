SUMMARY = "CUnit documentation"
DESCRIPTION = "CUnit is a unit testing framework for C. \
This package installs the CUnit \
documentation files."
LICENSE = "LGPL-2.0"

PV = "2.1.3"

RPM_NAME = "cunit-doc-2.1.3-5.26.aarch64.rpm"
RPM_HASH = "60aed93f0e210eb821b713626ba33ff280978d0d7771a2246628aaa625eed7ba1c8acec418e48d01a1d2582134f5587225980d6049fc784a8a404d9c2635bf0d"

RPROVIDES:${PN} += "cunit-doc \
cunit-doc(aarch-64)"

RDEPENDS:${PN} += "libcunit1"

inherit rpm
