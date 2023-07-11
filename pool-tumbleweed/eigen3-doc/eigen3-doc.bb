SUMMARY = "C++ Template Library for Linear Algebra"
DESCRIPTION = "Documentation in HTML format for the Eigen3 C++ Template Library \
for Linear Algebra"
LICENSE = "BSD-3-Clause & LGPL-2.1-only & MPL-2.0 & LGPL-2.1-or-later"

PV = "3.4.0"

RPM_NAME = "eigen3-doc-3.4.0-2.7.noarch.rpm"
RPM_HASH = "bae37b4e1f188b856da7d6456a12a65e30266ea4cdb5aaa43748d1b3eef69059cf47c9e2960a2b80cd151be7d2d68c52010be17906bff384766f663af4e99bda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eigen3-doc"

RDEPENDS:${PN} += ""

inherit rpm
