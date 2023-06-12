SUMMARY = "Documentation for texlive-datetime2-estonian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-estonian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47565"

RPM_NAME = "texlive-datetime2-estonian-doc-2023.201.1.1svn47565-52.1.noarch.rpm"
RPM_HASH = "23982846cbcbf0a6208a7f10e7346234d427888afd480e02a26bb2ff871717feb7cdeb4e53a07850f617e8fd5317a99950bb30e7d340617dbdb7049e3116a3b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-estonian-doc"
RDEPENDS:${PN} += ""

inherit rpm
