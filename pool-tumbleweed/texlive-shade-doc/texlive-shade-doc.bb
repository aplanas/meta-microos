SUMMARY = "Documentation for texlive-shade"
DESCRIPTION = "This package includes the documentation for texlive-shade"
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn22212"

RPM_NAME = "texlive-shade-doc-2023.209.1svn22212-54.1.noarch.rpm"
RPM_HASH = "224553977f5a50c77f5806307d7e46242a51a0de624c0b3ae23a79979f9fd0b8ba215ca36bfce69eaf1e98349b136a1a40db6370a8ea235726be1a1ffb0be51e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-shade-doc-en \
texlive-shade-doc"

RDEPENDS:${PN} += ""

inherit rpm
