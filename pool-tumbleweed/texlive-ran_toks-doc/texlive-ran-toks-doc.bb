SUMMARY = "Documentation for texlive-ran_toks"
DESCRIPTION = "This package includes the documentation for texlive-ran_toks"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn59515"

RPM_NAME = "texlive-ran_toks-doc-2023.209.svn59515-54.2.noarch.rpm"
RPM_HASH = "670fa3c1543aa809da0ac09a5cf23b04727124292484a698534c1abcbefb7bacc08f421998992c8068765ea5899ce70493809bdb56bacf283bfb330f3da113c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ran-toks-doc"

RDEPENDS:${PN} += ""

inherit rpm
