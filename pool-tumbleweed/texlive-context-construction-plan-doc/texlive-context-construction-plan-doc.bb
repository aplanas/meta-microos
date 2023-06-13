SUMMARY = "Documentation for texlive-context-construction-plan"
DESCRIPTION = "This package includes the documentation for texlive-context-construction-plan"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-construction-plan-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "6e6eafbfdc98ca9d5707858842bcda00cc00fe8b54f15f3fb3119fda2c8b510dd80af4f0eaedba7f654bed5768095055c1d542e074ec3ac8d22f8040fa5a08aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-construction-plan-doc"

RDEPENDS:${PN} += ""

inherit rpm
