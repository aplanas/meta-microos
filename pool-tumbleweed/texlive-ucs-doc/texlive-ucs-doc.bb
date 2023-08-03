SUMMARY = "Documentation for texlive-ucs"
DESCRIPTION = "This package includes the documentation for texlive-ucs"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn64114"

RPM_NAME = "texlive-ucs-doc-2023.209.2.3svn64114-54.1.noarch.rpm"
RPM_HASH = "1b1db7669f1b0aab7ea2fc5d979498363508b4b0d2b4066c2423dc52761495afcefcb5c1421ff62e663923c84f65e25b1b24d6830e05fa93e437fbaa38345af6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ucs-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
