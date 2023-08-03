SUMMARY = "Documentation for texlive-jmlr"
DESCRIPTION = "This package includes the documentation for texlive-jmlr"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.30svn61957"

RPM_NAME = "texlive-jmlr-doc-2023.209.1.30svn61957-56.1.noarch.rpm"
RPM_HASH = "e6f54b2e308d5c65bb5119e7452d15daa79cfec0b59e9adf3d04b6c714791aacf555928d787c284b83884ad4aea99e862085cd596abe53536d2cedf2e9f70388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jmlr-doc"

RDEPENDS:${PN} += ""

inherit rpm
