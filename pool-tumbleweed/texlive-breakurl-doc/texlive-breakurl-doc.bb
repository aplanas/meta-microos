SUMMARY = "Documentation for texlive-breakurl"
DESCRIPTION = "This package includes the documentation for texlive-breakurl"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.40svn29901"

RPM_NAME = "texlive-breakurl-doc-2023.209.1.40svn29901-53.1.noarch.rpm"
RPM_HASH = "fdb4c680f273d4e5c33e47ad97a380b706e82862fd379359cb4818c7df7c7f9c61868a3223214ca462de933606d2221f06eb11ddaad12dfcc5d588f380321a49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-breakurl-doc"

RDEPENDS:${PN} += ""

inherit rpm
