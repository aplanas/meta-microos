SUMMARY = "Documentation for texlive-mkpic"
DESCRIPTION = "This package includes the documentation for texlive-mkpic"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.02svn33700"

RPM_NAME = "texlive-mkpic-doc-2023.201.1.02svn33700-54.1.noarch.rpm"
RPM_HASH = "5a1f54472c142c618cdca43b25c3776503292efa111efefeea10fd6b6b254cf9f556db749e529e85f15f2b1ae3ef44c3df5285547bd408cba455536be6de3200"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mkpic-doc"
RDEPENDS:${PN} += ""

inherit rpm
