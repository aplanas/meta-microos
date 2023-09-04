SUMMARY = "Documentation for texlive-hyphen-sanskrit"
DESCRIPTION = "This package includes the documentation for texlive-hyphen-sanskrit"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-sanskrit-doc-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "ae0bcf156243faea4cc9fd0c5be16cdaaf78370c05d604168367a48d319c01a08d2639c5800298cb981d3741f360c1f8931f47dd8cc1a74df626526eedaa42bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyphen-sanskrit-doc"

RDEPENDS:${PN} += ""

inherit rpm
