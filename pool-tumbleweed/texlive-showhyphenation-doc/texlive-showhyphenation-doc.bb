SUMMARY = "Documentation for texlive-showhyphenation"
DESCRIPTION = "This package includes the documentation for texlive-showhyphenation"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1asvn63578"

RPM_NAME = "texlive-showhyphenation-doc-2023.209.0.0.1asvn63578-54.1.noarch.rpm"
RPM_HASH = "aa30036755f3130e3b5d14821ab2dc49cc6224f6c61ef745f4847d56935b11b18f3c4b0b28b2ac15a299b6c970f35e4b2167d04cfe7f9b865e5968aa335b9c65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-showhyphenation-doc"

RDEPENDS:${PN} += ""

inherit rpm
