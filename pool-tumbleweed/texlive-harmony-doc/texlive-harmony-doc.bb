SUMMARY = "Documentation for texlive-harmony"
DESCRIPTION = "This package includes the documentation for texlive-harmony"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-harmony-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "0ef6531c900aa50a1995f44a034fbd70e6d728d58be28cd8d0646763cfa0bed9e9f8c0eb4fc0deed3a20759cf1b7bc9f415e7212959be65454bd584435562461"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harmony-doc"

RDEPENDS:${PN} += ""

inherit rpm
