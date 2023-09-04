SUMMARY = "Documentation for texlive-wsuipa"
DESCRIPTION = "This package includes the documentation for texlive-wsuipa"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn25469"

RPM_NAME = "texlive-wsuipa-doc-2023.209.svn25469-53.2.noarch.rpm"
RPM_HASH = "befe6360666fd72a71929f119e2f6d443fe3faba6fb10882fb193b9ba95ac3bfad9e32a8b2cbd71a47d566a154541a1645644f7a6e7e51f1f84a0f8a0e01032f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wsuipa-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
