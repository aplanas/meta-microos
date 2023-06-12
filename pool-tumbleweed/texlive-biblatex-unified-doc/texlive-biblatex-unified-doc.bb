SUMMARY = "Documentation for texlive-biblatex-unified"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-unified"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.20svn64975"

RPM_NAME = "texlive-biblatex-unified-doc-2023.201.1.20svn64975-53.1.noarch.rpm"
RPM_HASH = "69728baea77fde0806b6bb8cad2c73fa306c1a9961692021b73c3bd87d724f9f19c895749a3db8df3de239f7d29419a41b02c93edf448984ea49058619ae0816"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-unified-doc"
RDEPENDS:${PN} += ""

inherit rpm
