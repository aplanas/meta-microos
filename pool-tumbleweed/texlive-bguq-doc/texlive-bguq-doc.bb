SUMMARY = "Documentation for texlive-bguq"
DESCRIPTION = "This package includes the documentation for texlive-bguq"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn27401"

RPM_NAME = "texlive-bguq-doc-2023.209.0.0.4svn27401-54.1.noarch.rpm"
RPM_HASH = "394cc51a8bdb11dd906c74c01e09d3b3554bc0ad7c2a269d73b7a4bb1b020fa3f4f6e7b1dfc00aaf05b621c7dd612667fb41d4f74fb293fc1b5ceb61db8807ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bguq-doc"

RDEPENDS:${PN} += ""

inherit rpm
