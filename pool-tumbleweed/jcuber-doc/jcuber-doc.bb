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

RPM_NAME = "jcuber-doc-4.4.1-2.14.noarch.rpm"
RPM_HASH = "122cd3703c52d537cc07afb1e2e6f323fade27b268f3f5fe82bba52a4b6127b4cef6d7ddf49d82d532c1cbb13a3600c57e080db8d60e51a1298b01adcde1a9f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcuber-doc"
RDEPENDS:${PN} += ""

inherit rpm
