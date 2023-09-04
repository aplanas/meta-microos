SUMMARY = "Documentation for texlive-xcite"
DESCRIPTION = "This package includes the documentation for texlive-xcite"
LICENSE = "LPPL-1.0"

PV = "2023.209.16383.99998svn53486"

RPM_NAME = "texlive-xcite-doc-2023.209.16383.99998svn53486-53.2.noarch.rpm"
RPM_HASH = "18d2a5d9973bfc3dd83825c11a8f12d6a1f54d0fec1d3740c1d053bf5e59b07ba2aeb710ceaca28638181db7977c98edee64e19cd2e5a70ba7d549e3a8f9b285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcite-doc"

RDEPENDS:${PN} += ""

inherit rpm
