SUMMARY = "Documentation for texlive-dprogress"
DESCRIPTION = "This package includes the documentation for texlive-dprogress"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-dprogress-doc-2023.209.0.0.1svn15878-53.1.noarch.rpm"
RPM_HASH = "6d5d5b456b3a0565f4ca7cc9de6c598b3cefb9e61c8d940188f4a46e47e5045f860522e90e0152293c7433538041ef84ecc028bf878baf6cbe93c2838e6af834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dprogress-doc"

RDEPENDS:${PN} += ""

inherit rpm
