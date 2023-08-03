SUMMARY = "Documentation for texlive-dinbrief"
DESCRIPTION = "This package includes the documentation for texlive-dinbrief"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-dinbrief-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "2ba7161eaa41c462e4bbef03419a5391123679bfe4f66e8c509be2e6c81b1f908407c9747d4e4c3185bc5735c7b4b2a9b265013fd12f55af8006bc82b844f529"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dinbrief-doc-de;en \
texlive-dinbrief-doc"

RDEPENDS:${PN} += ""

inherit rpm
