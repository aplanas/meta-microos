SUMMARY = "Documentation for texlive-thuaslogos"
DESCRIPTION = "This package includes the documentation for texlive-thuaslogos"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn51347"

RPM_NAME = "texlive-thuaslogos-doc-2023.209.1.2svn51347-55.1.noarch.rpm"
RPM_HASH = "5cb6c2cce2b3301aaca70cb6a766aa7e3b3cbe561783dab115970d5b9a9e3e6099c9249451725dbddf85ab091c5f7603cf5ffc934d222983c27a5aa01d788e94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-thuaslogos-doc-nl \
texlive-thuaslogos-doc"

RDEPENDS:${PN} += ""

inherit rpm
