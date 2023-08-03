SUMMARY = "Documentation for texlive-srcredact"
DESCRIPTION = "This package includes the documentation for texlive-srcredact"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn38710"

RPM_NAME = "texlive-srcredact-doc-2023.209.1.0svn38710-58.1.noarch.rpm"
RPM_HASH = "8ad713ab6acc1230f99a2088524f88693305dd795bc90f6669719cca2ad01f6ba4b13d67912a03bf5f3c72151ae04c263985072ced284636ba3293ea4a63f95e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-srcredact.1 \
texlive-srcredact-doc"

RDEPENDS:${PN} += ""

inherit rpm
