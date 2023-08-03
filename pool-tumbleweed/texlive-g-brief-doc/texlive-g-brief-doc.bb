SUMMARY = "Documentation for texlive-g-brief"
DESCRIPTION = "This package includes the documentation for texlive-g-brief"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.0.3svn50415"

RPM_NAME = "texlive-g-brief-doc-2023.209.4.0.3svn50415-53.1.noarch.rpm"
RPM_HASH = "be67a83c7a0b31c35c0f78f8d2ed61dc9d657025ddcfec76f10684c1c702e9969aa5d0b29d2b1892a591ae68d0b1451bf6d5106849ce08785e3288355964bc7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-g-brief-doc-de \
texlive-g-brief-doc"

RDEPENDS:${PN} += ""

inherit rpm
