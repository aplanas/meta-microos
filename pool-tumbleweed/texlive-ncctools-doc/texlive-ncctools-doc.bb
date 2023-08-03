SUMMARY = "Documentation for texlive-ncctools"
DESCRIPTION = "This package includes the documentation for texlive-ncctools"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.5.3svn51810"

RPM_NAME = "texlive-ncctools-doc-2023.209.3.5.3svn51810-55.1.noarch.rpm"
RPM_HASH = "f32d13808acf2a6fb844c3c443a6713d7340125a4d8c8c6ccdd87b3b660a0e90b35a58b325421d783cd300a66d59cdc5c8dbe0f37a055cafc23db129aefe602c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ncctools-doc"

RDEPENDS:${PN} += ""

inherit rpm
