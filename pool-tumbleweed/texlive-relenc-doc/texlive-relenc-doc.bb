SUMMARY = "Documentation for texlive-relenc"
DESCRIPTION = "This package includes the documentation for texlive-relenc"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn22050"

RPM_NAME = "texlive-relenc-doc-2023.201.svn22050-53.2.noarch.rpm"
RPM_HASH = "c54a960c0dd3427952b2ac73ea8efb65fcf329d3877a517af032c0ff0c69d70f68e202a9cba04ff2188ed5bfc262ce3d2ed53ac769bbb7cf36e25eae8a1581db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-relenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
