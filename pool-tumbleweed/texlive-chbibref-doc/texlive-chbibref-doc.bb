SUMMARY = "Documentation for texlive-chbibref"
DESCRIPTION = "This package includes the documentation for texlive-chbibref"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn17120"

RPM_NAME = "texlive-chbibref-doc-2023.209.1.0svn17120-54.1.noarch.rpm"
RPM_HASH = "f329ace379688b927e3df75de607fc5e50855ab17cad5c8f69b4184ea3a028ddd1c27aa969d1b658a25ac2db91f4198bac81f649ce063e372e1e2357c790877d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chbibref-doc"

RDEPENDS:${PN} += ""

inherit rpm
