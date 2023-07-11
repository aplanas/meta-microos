SUMMARY = "Documentation for for jcuber"
DESCRIPTION = "Java Cube Reader Library is a native Java library for reading of a \
multi-dimensional performance space consisting of the dimensions \
(i) performance metric, (ii) call path, and (iii) system resource. \
Each dimension can be represented as a tree, where non-leaf nodes \
of the tree can be collapsed or expanded to achieve the desired level \
of granularity. \
This package contains the documentation and examples for jcuber."
LICENSE = "BSD-3-Clause & Apache-2.0"

PV = "4.4.1"

RPM_NAME = "jcuber-doc-4.4.1-2.15.noarch.rpm"
RPM_HASH = "95f9a22f761eef6a94fd2cdaa6a5e5440bb642f2e38feee2723aa7551f85654b00e2aa413d74d0c12aaa9390a62461ca0548ad91e31465c9b86271606a2da7bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcuber-doc"

RDEPENDS:${PN} += ""

inherit rpm
