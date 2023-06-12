SUMMARY = "HTML documentation for orthos2"
DESCRIPTION = "HTML documentation that can be put into a web servers htdocs directory for publishing."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.169+git.a693485"

RPM_NAME = "orthos2-docs-1.2.169+git.a693485-1.1.noarch.rpm"
RPM_HASH = "9b2fe77eda12a0be10a266cca75726ead1045df94872ba4829a4261013de04b4db4af56f4b5b548393a43a5d984b33dc006633a3df399f7dd1d8a4d619e56e6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "orthos2-docs"
RDEPENDS:${PN} += ""

inherit rpm
