SUMMARY = "Documentation for texlive-smalltableof"
DESCRIPTION = "This package includes the documentation for texlive-smalltableof"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20333"

RPM_NAME = "texlive-smalltableof-doc-2023.201.svn20333-57.1.noarch.rpm"
RPM_HASH = "194730311a7241d27e0b57bcc0108c8d969f618e4341a91a78442bb7b90a02424ec710d2fb31490925d29430c1bbbf169ad57935b29ead856e29011de77f53cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-smalltableof-doc:fr) \
texlive-smalltableof-doc"
RDEPENDS:${PN} += ""

inherit rpm
