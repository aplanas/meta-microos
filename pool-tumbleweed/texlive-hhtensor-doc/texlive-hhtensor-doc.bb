SUMMARY = "Documentation for texlive-hhtensor"
DESCRIPTION = "This package includes the documentation for texlive-hhtensor"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.61svn54080"

RPM_NAME = "texlive-hhtensor-doc-2023.201.0.0.61svn54080-53.2.noarch.rpm"
RPM_HASH = "50395e58dcc7f11565cdd2693766f2a7d5c50c1618a19552613f05f9d768e89f17ca9c8a3058e91ef5831d76b65994bdde4359787bd08a57c94431b7369ece44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hhtensor-doc"

RDEPENDS:${PN} += ""

inherit rpm
