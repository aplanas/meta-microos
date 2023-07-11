SUMMARY = "Documentation for texlive-luaimageembed"
DESCRIPTION = "This package includes the documentation for texlive-luaimageembed"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1svn50788"

RPM_NAME = "texlive-luaimageembed-doc-2023.208.0.0.1svn50788-53.1.noarch.rpm"
RPM_HASH = "1da136fe99dc5cf41bdd23c8bf1957e780b117403313252300612337d60282d98e9625c149ef435ab03ab2010e7cd3f36ab175abdb50460091fb4708756cbeac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaimageembed-doc"

RDEPENDS:${PN} += ""

inherit rpm
