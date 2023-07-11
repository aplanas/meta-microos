SUMMARY = "Documentation for texlive-hobete"
DESCRIPTION = "This package includes the documentation for texlive-hobete"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn27036"

RPM_NAME = "texlive-hobete-doc-2023.201.svn27036-53.2.noarch.rpm"
RPM_HASH = "10df0b9c2f86ea57d2d216e4f96eb66ba709a105c20c97c5e1f1929d2b64b3a8011ff0a9b98474e9f64fe0dbba3c9338586d0954f32ed590b69f80ca3088045d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hobete-doc-de \
texlive-hobete-doc"

RDEPENDS:${PN} += ""

inherit rpm
