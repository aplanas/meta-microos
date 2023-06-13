SUMMARY = "Documentation for texlive-fandol"
DESCRIPTION = "This package includes the documentation for texlive-fandol"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.3svn37889"

RPM_NAME = "texlive-fandol-doc-2023.201.0.0.3svn37889-52.1.noarch.rpm"
RPM_HASH = "4b37191a15401dfbd3f1c3ac31644de52b54e7b958f3d00ac1f91d194a55072a6ab56aec39ff441347895e648d605563ab0046ddc1e7cbf2742981e1d6def7d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fandol-doc"

RDEPENDS:${PN} += ""

inherit rpm
