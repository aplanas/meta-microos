SUMMARY = "Documentation for texlive-tikz-inet"
DESCRIPTION = "This package includes the documentation for texlive-tikz-inet"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-tikz-inet-doc-2023.209.0.0.1svn15878-53.1.noarch.rpm"
RPM_HASH = "8f719a378d1113a14dae7c07b9468766dd71788354092abd379e9c80b8326138acf6dbb6cdff190733a929e7ed2fd6ced5fa48da6ea646a6318e8cff82b517b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-inet-doc"

RDEPENDS:${PN} += ""

inherit rpm
