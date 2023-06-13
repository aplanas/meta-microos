SUMMARY = "Documentation for texlive-biblist"
DESCRIPTION = "This package includes the documentation for texlive-biblist"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn17116"

RPM_NAME = "texlive-biblist-doc-2023.201.svn17116-53.1.noarch.rpm"
RPM_HASH = "74cef16bb20ed80446e694cec4b943a48beb8179c4980c3eaccdb17e95682b8e2e1c804335eb05bd8d8631f0e4238ae4756ee0e73b3531d5f79c2774fe097014"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblist-doc"

RDEPENDS:${PN} += ""

inherit rpm
