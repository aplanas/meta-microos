SUMMARY = "Documentation for texlive-aspectratio"
DESCRIPTION = "This package includes the documentation for texlive-aspectratio"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn25243"

RPM_NAME = "texlive-aspectratio-doc-2023.209.2.0svn25243-54.1.noarch.rpm"
RPM_HASH = "7063d1dca113bc9a4b0fb2d867538f5428ce48f1fe30e1ad1ba09153b9ade3eb210523a24175262d11f4f34f82a5c9770ec922c65b153771976a37c96dd304e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aspectratio-doc"

RDEPENDS:${PN} += ""

inherit rpm
