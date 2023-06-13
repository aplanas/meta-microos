SUMMARY = "Documentation for texlive-duerer-latex"
DESCRIPTION = "This package includes the documentation for texlive-duerer-latex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-duerer-latex-doc-2023.201.1.1svn15878-52.1.noarch.rpm"
RPM_HASH = "d972c5980a0dd730bd98fb63e4919ec97cf77de7ed7221ff4dc23b958637c39af1f12d46be3877755af76da9b5f63737cac1af846e096ae27ab688ecd9a9e519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-duerer-latex-doc"

RDEPENDS:${PN} += ""

inherit rpm
