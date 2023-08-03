SUMMARY = "Documentation for texlive-termsim"
DESCRIPTION = "This package includes the documentation for texlive-termsim"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.1svn61414"

RPM_NAME = "texlive-termsim-doc-2023.209.1.1.1svn61414-55.1.noarch.rpm"
RPM_HASH = "38d8f0a4952541ea132d5ca589a1a4acf7c9c060b194cccf09956d950118bd9e34ea53de7c2a2315b59fc4e5431abb79fafe27790f3b51a51f3f82408d118598"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-termsim-doc-zh \
texlive-termsim-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
