SUMMARY = "Documentation for texlive-mla-paper"
DESCRIPTION = "This package includes the documentation for texlive-mla-paper"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54080"

RPM_NAME = "texlive-mla-paper-doc-2023.209.svn54080-55.1.noarch.rpm"
RPM_HASH = "2868b519319ab8415def243b4610af7b32612a7a627481a52e26fbbf59f1ddc914ab19c9c1684cb966505bf20fef35045da62c3286052160f4d1e87957aae412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mla-paper-doc"

RDEPENDS:${PN} += ""

inherit rpm
