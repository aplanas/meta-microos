SUMMARY = "Documentation for texlive-gillius"
DESCRIPTION = "This package includes the documentation for texlive-gillius"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn64865"

RPM_NAME = "texlive-gillius-doc-2023.209.svn64865-53.1.noarch.rpm"
RPM_HASH = "e6c77d95e65dc22dd9a3a575f1f7e00e02125351422dc34083d84db26b6679fa63989f44de04efe14470ffabb3c1d79ecb44d6a0c44c6fe7d6d6b72dc64a71f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gillius-doc"

RDEPENDS:${PN} += ""

inherit rpm
