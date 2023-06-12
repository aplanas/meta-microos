SUMMARY = "Document non-LaTeX code"
DESCRIPTION = "Extends the doc package to cater for documenting non-LaTeX \
code, such as Metafont or MetaPost, or other programming \
languages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2dsvn15878"

RPM_NAME = "texlive-docmfp-2023.201.1.2dsvn15878-52.1.noarch.rpm"
RPM_HASH = "9ee49aba8c9da8e3752e5d576b192c78401ee17eacaefa0362fcfcd8d1bcc3e56e4e4a79ca69c5aa2935137c3a58861d2ce59474cb4bf66e952a003a595c9f7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(docmfp.sty) \
texlive-docmfp"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
