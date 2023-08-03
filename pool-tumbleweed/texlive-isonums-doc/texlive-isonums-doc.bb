SUMMARY = "Documentation for texlive-isonums"
DESCRIPTION = "This package includes the documentation for texlive-isonums"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn17362"

RPM_NAME = "texlive-isonums-doc-2023.209.1.0svn17362-56.1.noarch.rpm"
RPM_HASH = "65c9785115175570d8ae595682135a6abe9e1ff13bc18831311a11c477367381b3f344aa6d91ec6af72824d299474d95c36e7bf719df658b9441a0e144bdad69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isonums-doc"

RDEPENDS:${PN} += ""

inherit rpm
