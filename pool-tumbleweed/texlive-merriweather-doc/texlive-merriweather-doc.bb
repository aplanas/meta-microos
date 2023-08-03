SUMMARY = "Documentation for texlive-merriweather"
DESCRIPTION = "This package includes the documentation for texlive-merriweather"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64452"

RPM_NAME = "texlive-merriweather-doc-2023.209.svn64452-55.1.noarch.rpm"
RPM_HASH = "ad09e616042f25e231404e68164e3dfae7416b2a17fe3d3e25be8884bbfbae835872f277892b818d985bb5222a469f588bd1dab75465761dab72ed212df0ed89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-merriweather-doc"

RDEPENDS:${PN} += ""

inherit rpm
