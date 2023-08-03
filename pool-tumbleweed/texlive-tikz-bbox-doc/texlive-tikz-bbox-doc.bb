SUMMARY = "Documentation for texlive-tikz-bbox"
DESCRIPTION = "This package includes the documentation for texlive-tikz-bbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn57444"

RPM_NAME = "texlive-tikz-bbox-doc-2023.209.0.0.1svn57444-55.1.noarch.rpm"
RPM_HASH = "f435b39a6d3bc1572a633ed524fa78e3adacf00f66f6d1461a751d72b9b3586c1cfb407f248bc17221838f0f94791b263d2fa5192f2a20d25464e1a9424da758"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-bbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
