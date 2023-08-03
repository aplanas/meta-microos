SUMMARY = "Documentation for texlive-rank-2-roots"
DESCRIPTION = "This package includes the documentation for texlive-rank-2-roots"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn61719"

RPM_NAME = "texlive-rank-2-roots-doc-2023.209.1.0svn61719-54.1.noarch.rpm"
RPM_HASH = "19c0cdf8c302fa297aba19162554484ea51db1b57952199bf0ad329476439f3f1aa88656378a262e3284c0a36c2698cdfaee15e7772c54efbc7f762d1e18c3ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rank-2-roots-doc"

RDEPENDS:${PN} += ""

inherit rpm
