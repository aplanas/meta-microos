SUMMARY = "Documentation for texlive-rescansync"
DESCRIPTION = "This package includes the documentation for texlive-rescansync"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.0svn63856"

RPM_NAME = "texlive-rescansync-doc-2023.209.0.0.0.0svn63856-54.2.noarch.rpm"
RPM_HASH = "3712bde160761a6fda1fde24f483b634c7e3b028373f8d12b1c257de3186ba862b54082eaab9189a1989d583bb82f3c10fda0a9e4942c626ef140c1b6a3bcc91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rescansync-doc"

RDEPENDS:${PN} += ""

inherit rpm
