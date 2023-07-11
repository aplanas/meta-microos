SUMMARY = "Documentation for texlive-lua-typo"
DESCRIPTION = "This package includes the documentation for texlive-lua-typo"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.65svn66513"

RPM_NAME = "texlive-lua-typo-doc-2023.208.0.0.65svn66513-53.1.noarch.rpm"
RPM_HASH = "4705a5919d343d8fc58486b30b81fd3b4569a98ca00785a8f299167be292d23a5e1efb047495d39be4fc0382592fd82be8684f4c4a73026bef49e797b6065c25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-lua-typo-doc-fr \
texlive-lua-typo-doc"

RDEPENDS:${PN} += ""

inherit rpm
