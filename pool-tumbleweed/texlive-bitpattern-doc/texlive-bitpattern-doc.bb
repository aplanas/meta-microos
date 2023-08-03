SUMMARY = "Documentation for texlive-bitpattern"
DESCRIPTION = "This package includes the documentation for texlive-bitpattern"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn39073"

RPM_NAME = "texlive-bitpattern-doc-2023.209.svn39073-53.1.noarch.rpm"
RPM_HASH = "e7f03d593c587efa4b557dcf3f62c21b2960fc689bfce215e525daf0fde147724ccd0c50db7db36ad3276815d05072263237084123d58d094087e611691201ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bitpattern-doc"

RDEPENDS:${PN} += ""

inherit rpm
