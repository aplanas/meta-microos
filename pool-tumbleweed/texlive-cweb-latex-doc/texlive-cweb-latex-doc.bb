SUMMARY = "Documentation for texlive-cweb-latex"
DESCRIPTION = "This package includes the documentation for texlive-cweb-latex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn28878"

RPM_NAME = "texlive-cweb-latex-doc-2023.204.svn28878-54.1.noarch.rpm"
RPM_HASH = "de2858c964d79d472cc8d75420753cc4b42400a3ed0b28dab7ba6492ac357a72d5a3ab35d369d998c8b9667b8b62e7a475d55be5ac37fd26aa8288746d764d8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cweb-latex-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
