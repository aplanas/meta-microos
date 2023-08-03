SUMMARY = "Documentation for texlive-labbook"
DESCRIPTION = "This package includes the documentation for texlive-labbook"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-labbook-doc-2023.209.svn15878-56.1.noarch.rpm"
RPM_HASH = "dc5bd94499a5c339060b3f00c536327e6c4b1fd8f7a1429ed38651aa0be1cb09ad40ddba471e8f31d0091147d7394058c7b2e1decc845174b4f96dc3eccb021b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-labbook-doc-de;en \
texlive-labbook-doc"

RDEPENDS:${PN} += ""

inherit rpm
