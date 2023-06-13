SUMMARY = "Typeset numbers"
DESCRIPTION = "A LaTeX package for typesetting numbers, in particular floating \
point numbers, such as you find in program output."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.92svn15878"

RPM_NAME = "texlive-fancynum-2023.201.0.0.92svn15878-52.1.noarch.rpm"
RPM_HASH = "c733a04dd244fcb25c1316ba741faa08c20eb0e2f237da2b9a0a3378d6b7bafe021ef3099c0c3f6949a099169efae731be777862f820a00e212b782ddae9048f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fancynum.sty) \
texlive-fancynum"

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
