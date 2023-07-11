SUMMARY = "Java Cube Reader Library"
DESCRIPTION = "Java Cube Reader Library is a native Java library for reading of a \
multi-dimensional performance space consisting of the dimensions \
(i) performance metric, (ii) call path, and (iii) system resource. \
Each dimension can be represented as a tree, where non-leaf nodes \
of the tree can be collapsed or expanded to achieve the desired level \
of granularity."
LICENSE = "BSD-3-Clause & Apache-2.0"

PV = "4.4.1"

RPM_NAME = "jcuber-4.4.1-2.15.noarch.rpm"
RPM_HASH = "c9500c4d39c408b6c75e7b98395d58a3513639d2f4630664ed93ed1fe8c815ea2ca6e5391218a9bacaf8c09fca83e85aa972542c9721303590e03064d7ff353b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcuber"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
