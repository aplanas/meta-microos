SUMMARY = "Documentation for texlive-plari"
DESCRIPTION = "This package includes the documentation for texlive-plari"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-plari-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "6442b2f2a5b577d5f535591dcddacd6dfa456de8d37a747b277c12ebfb2ff14688e010b61505b3c6d54a0de56543ebe9c8383bfe9602d7ece5c1c50706c08414"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plari-doc"

RDEPENDS:${PN} += ""

inherit rpm
