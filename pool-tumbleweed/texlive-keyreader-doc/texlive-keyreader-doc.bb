SUMMARY = "Documentation for texlive-keyreader"
DESCRIPTION = "This package includes the documentation for texlive-keyreader"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5bsvn28195"

RPM_NAME = "texlive-keyreader-doc-2023.209.0.0.5bsvn28195-56.1.noarch.rpm"
RPM_HASH = "e6aef0fd6e686f04518da6f6e40290f25afc9655512175da3329f244bc77fbe932b4680dc602fe02c5df6452d4fbfcd19ad631c7dfdffd1c2b586c2a6a858601"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keyreader-doc"

RDEPENDS:${PN} += ""

inherit rpm
