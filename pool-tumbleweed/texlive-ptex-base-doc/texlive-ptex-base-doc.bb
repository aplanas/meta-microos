SUMMARY = "Documentation for texlive-ptex-base"
DESCRIPTION = "This package includes the documentation for texlive-ptex-base"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn64072"

RPM_NAME = "texlive-ptex-base-doc-2023.209.svn64072-54.2.noarch.rpm"
RPM_HASH = "07078a9ed20a36c858ddc7f87b8eb6756c40134126c4ac094dee6be5a86718c366e73e63965baab3dd780e6ebb03c9bbb674923820e98a7cebc4cf5064e5a189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex-base-doc"

RDEPENDS:${PN} += ""

inherit rpm
