SUMMARY = "Documentation for texlive-gsftopk"
DESCRIPTION = "This package includes the documentation for texlive-gsftopk"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.19.2svn52851"

RPM_NAME = "texlive-gsftopk-doc-2023.209.1.19.2svn52851-54.1.noarch.rpm"
RPM_HASH = "18e2efdc30023f202bf568f823b11b93e0f2fe30efc450200b3478b47fec6b5b9f25fe348b5d70cebce8557e94344187fe49a331ae6869c651860cccce65495c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-gsftopk.1 \
texlive-gsftopk-doc"

RDEPENDS:${PN} += ""

inherit rpm
