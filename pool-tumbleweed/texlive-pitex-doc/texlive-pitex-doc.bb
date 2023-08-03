SUMMARY = "Documentation for texlive-pitex"
DESCRIPTION = "This package includes the documentation for texlive-pitex"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn24731"

RPM_NAME = "texlive-pitex-doc-2023.209.svn24731-52.1.noarch.rpm"
RPM_HASH = "a2743bccffb1add5827533b6585710871e7b660e958ab854f8f356e652464a24c4b2543206e6c102aacd554e56475e9be8353339feaa5344e1fc948589b15337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pitex-doc"

RDEPENDS:${PN} += ""

inherit rpm
