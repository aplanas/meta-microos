SUMMARY = "Documentation for texlive-proflabo"
DESCRIPTION = "This package includes the documentation for texlive-proflabo"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn63147"

RPM_NAME = "texlive-proflabo-doc-2023.209.1.0svn63147-53.1.noarch.rpm"
RPM_HASH = "cd20aa8ce9bf57360b215efc5873e0a48cb1f8bb001265c72f3dffb97ab7aa8d011c4db1f01c1ce3c7226631d12fb8fd808a31db8bcae9907c3a8607635f0275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-proflabo-doc"

RDEPENDS:${PN} += ""

inherit rpm
