SUMMARY = "Documentation for texlive-rulerbox"
DESCRIPTION = "This package includes the documentation for texlive-rulerbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn50984"

RPM_NAME = "texlive-rulerbox-doc-2023.209.1.01svn50984-54.1.noarch.rpm"
RPM_HASH = "afb42492718fff5fa8f690e6ee8b964c1802bf1478696fc79002b3970353b584d024f7b68aa6419485c12e210ba22620dbdd92332fc80008791692f82fc271cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rulerbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
