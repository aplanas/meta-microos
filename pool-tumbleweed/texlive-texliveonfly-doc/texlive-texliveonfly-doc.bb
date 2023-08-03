SUMMARY = "Documentation for texlive-texliveonfly"
DESCRIPTION = "This package includes the documentation for texlive-texliveonfly"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn55777"

RPM_NAME = "texlive-texliveonfly-doc-2023.209.svn55777-55.1.noarch.rpm"
RPM_HASH = "e1d87e707be3f34d55ef205dd27588addce1152a53ccd2f258e7639312a5f40b59766e68a31d3db420758b69cf858c7505bc59a31f6ac39a414b5553cfa32c5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texliveonfly-doc"

RDEPENDS:${PN} += ""

inherit rpm
