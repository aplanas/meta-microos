SUMMARY = "Documentation for texlive-fontwrap"
DESCRIPTION = "This package includes the documentation for texlive-fontwrap"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-fontwrap-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "5956f2f8df2b8e73a714cdce1c1f41717ff2dfd38bc4e07fa2298e2fde2a06be5c82213e8f0e44fdd4f38d16d362e5c4b306c8cabd810332877f4728c077299a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontwrap-doc"

RDEPENDS:${PN} += ""

inherit rpm
