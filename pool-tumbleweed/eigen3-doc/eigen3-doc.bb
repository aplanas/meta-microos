SUMMARY = "C++ Template Library for Linear Algebra"
DESCRIPTION = "Documentation in HTML format for the Eigen3 C++ Template Library \
for Linear Algebra"
LICENSE = "BSD-3-Clause & LGPL-2.1-only & MPL-2.0 & LGPL-2.1-or-later"

PV = "3.4.0"

RPM_NAME = "eigen3-doc-3.4.0-2.6.noarch.rpm"
RPM_HASH = "932708093b28ead10f3d23db01d5f0c120da74bb39f60168157db6ac6b25f44ac882938bc90e16666567aa6c64e39b2e32dd5800c0de0942fb7e793a98cf4836"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eigen3-doc"

RDEPENDS:${PN} += ""

inherit rpm
