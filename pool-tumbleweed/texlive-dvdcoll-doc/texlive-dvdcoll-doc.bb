SUMMARY = "Documentation for texlive-dvdcoll"
DESCRIPTION = "This package includes the documentation for texlive-dvdcoll"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn15878"

RPM_NAME = "texlive-dvdcoll-doc-2023.209.1.1asvn15878-54.1.noarch.rpm"
RPM_HASH = "f177485a4748aa099fd79c082dedd45608606b2e96a40bbba2e1cb984a7444dc0b309681b9ab4368bce84a0a6d4c9355fbff155e1f0455f96e9a664fe2a22cb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dvdcoll-doc-en;de \
texlive-dvdcoll-doc"

RDEPENDS:${PN} += ""

inherit rpm
