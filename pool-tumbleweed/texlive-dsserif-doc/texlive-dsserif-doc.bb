SUMMARY = "Documentation for texlive-dsserif"
DESCRIPTION = "This package includes the documentation for texlive-dsserif"
LICENSE = "OFL-1.1"

PV = "2023.201.1.031svn60898"

RPM_NAME = "texlive-dsserif-doc-2023.201.1.031svn60898-52.1.noarch.rpm"
RPM_HASH = "04c53185786f7218527f456b7c5e46d3643f8095eb6ddc66d31dd75efe58585666897aab24099a5b240ad7c3a297638c675770d58cb74914f6a291b9e24bfe15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dsserif-doc"

RDEPENDS:${PN} += ""

inherit rpm
