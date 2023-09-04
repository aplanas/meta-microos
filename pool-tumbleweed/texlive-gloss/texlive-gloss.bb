SUMMARY = "Create glossaries using BibTeX"
DESCRIPTION = "A glossary package using BibTeX with \\cite replaced by \\gloss."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.2svn15878"

RPM_NAME = "texlive-gloss-2023.209.1.5.2svn15878-54.2.noarch.rpm"
RPM_HASH = "fc42e016f426fd761926bd6d02b927aba89740d0b4e9a7814b80b865debf177fa31c7f0f8b29ea1881a47962eeed2beed9380b048b5721505fccd865bf129f64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gloss.sty \
texlive-gloss"

RDEPENDS:${PN} += "/usr/bin/sh \
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
