SUMMARY = "Documentation for texlive-xecolor"
DESCRIPTION = "This package includes the documentation for texlive-xecolor"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn29660"

RPM_NAME = "texlive-xecolor-doc-2023.209.0.0.1svn29660-53.2.noarch.rpm"
RPM_HASH = "ae3bcb9dc94d9809f73e89f4ae676211e2bf454bc08d9713c9c3eaa23f6b1e9a52f2e2169892f0132b4208b54307a5295c909d22c9cf48708462d1c453f2b52e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xecolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
