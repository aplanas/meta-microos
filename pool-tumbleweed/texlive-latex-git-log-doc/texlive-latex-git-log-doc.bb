SUMMARY = "Documentation for texlive-latex-git-log"
DESCRIPTION = "This package includes the documentation for texlive-latex-git-log"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0.0svn54010"

RPM_NAME = "texlive-latex-git-log-doc-2023.209.1.0.0svn54010-56.1.noarch.rpm"
RPM_HASH = "7c90208e772737b902fda31006a0f5b25084a26f6b8d7223066b75a80c4f4409e535b216e84cc112efd9abff804bef961c70c8d06bdd7ba359d5383f20c5b471"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-latex-git-log.1 \
texlive-latex-git-log-doc"

RDEPENDS:${PN} += ""

inherit rpm
