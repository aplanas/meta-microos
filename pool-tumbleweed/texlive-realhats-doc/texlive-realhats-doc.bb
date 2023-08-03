SUMMARY = "Documentation for texlive-realhats"
DESCRIPTION = "This package includes the documentation for texlive-realhats"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.0svn63595"

RPM_NAME = "texlive-realhats-doc-2023.209.6.0svn63595-54.1.noarch.rpm"
RPM_HASH = "277fd60211ea59412c1fc90d5e8181fce931a76d2ed9212e099e261ef05b69cedd1df661245b52f3c6513407a57f5921a7702077ee05c1e96ce20dff88743860"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-realhats-doc"

RDEPENDS:${PN} += ""

inherit rpm
