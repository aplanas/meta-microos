SUMMARY = "Documentation for texlive-metalogo"
DESCRIPTION = "This package includes the documentation for texlive-metalogo"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.12svn18611"

RPM_NAME = "texlive-metalogo-doc-2023.209.0.0.12svn18611-55.1.noarch.rpm"
RPM_HASH = "af0c8c985a5f431b0389da1c87c37a19a98bc0d841aa9f0d41c80fbab3b6514352a7658527df062be4b31a31bcc635bfc9da2298bf42fc889e1233e0b085951d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metalogo-doc"

RDEPENDS:${PN} += ""

inherit rpm
