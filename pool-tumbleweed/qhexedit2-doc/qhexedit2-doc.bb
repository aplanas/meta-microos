SUMMARY = "Documentation and examples for qhexedit2"
DESCRIPTION = "The qhexedit2-doc package contains the documentation and examples for qhexedit2."
LICENSE = "LGPL-2.0-only"

PV = "0.8.9"

RPM_NAME = "qhexedit2-doc-0.8.9-1.16.noarch.rpm"
RPM_HASH = "c57ffa5d9737c540f5d0737834d3d5cddf92f0df01e13115b5ccf4181c4b03d79fa7a0618f5a109a01ce8cb97523cd7af41d039014153ecd2d2e973dff7e9f6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qhexedit2-doc"

RDEPENDS:${PN} += ""

inherit rpm
