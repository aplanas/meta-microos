SUMMARY = "Documentation for texlive-luapstricks"
DESCRIPTION = "This package includes the documentation for texlive-luapstricks"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8svn65913"

RPM_NAME = "texlive-luapstricks-doc-2023.201.0.0.8svn65913-52.1.noarch.rpm"
RPM_HASH = "8bd8fd2c3b074a48f096a614d26d475ded49ee0be532cba06f145a95a82638368dc588107da98b22c8a8ee693b3382475943c9c3544c09a9b82ea52f3e0739fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luapstricks-doc"

RDEPENDS:${PN} += ""

inherit rpm
