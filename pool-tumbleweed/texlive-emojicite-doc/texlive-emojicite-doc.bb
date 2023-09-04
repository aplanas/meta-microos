SUMMARY = "Documentation for texlive-emojicite"
DESCRIPTION = "This package includes the documentation for texlive-emojicite"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn55131"

RPM_NAME = "texlive-emojicite-doc-2023.209.0.0.3svn55131-54.2.noarch.rpm"
RPM_HASH = "2cb1a5d4b695d7cb05c921422ae228fb278735ed4ca475f2244185b00c4839350eac944a4b925378bad49bf6ac06a1aefdda40b3fd5c17b2a8d5c030a8032d96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emojicite-doc"

RDEPENDS:${PN} += ""

inherit rpm
