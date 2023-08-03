SUMMARY = "Documentation for texlive-tableaux"
DESCRIPTION = "This package includes the documentation for texlive-tableaux"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn42413"

RPM_NAME = "texlive-tableaux-doc-2023.209.svn42413-58.1.noarch.rpm"
RPM_HASH = "fb8548a84cfcb9c2cf4b86a819d427594941cde97b7f708121b5dc230820e0da60109b6df07afe9314e042a58775b600f8497028d2f189e66067017014ed2d11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tableaux-doc-fr \
texlive-tableaux-doc"

RDEPENDS:${PN} += ""

inherit rpm
