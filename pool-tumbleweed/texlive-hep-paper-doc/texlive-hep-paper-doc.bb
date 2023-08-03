SUMMARY = "Documentation for texlive-hep-paper"
DESCRIPTION = "This package includes the documentation for texlive-hep-paper"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn64917"

RPM_NAME = "texlive-hep-paper-doc-2023.209.2.1svn64917-54.1.noarch.rpm"
RPM_HASH = "e7e559faab280fb4d242d854641aa04870d68155db32bb128431c3bb296135fe81f92165fd85d7ce528509ad2b92f085fc873f8fa21e58a64f39b52dc45ca216"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-paper-doc"

RDEPENDS:${PN} += ""

inherit rpm
