SUMMARY = "Babel support for Portuges"
DESCRIPTION = "The package provides the language definition file for support \
of Portuguese and Brazilian Portuguese in babel. Some shortcuts \
are defined, as well as translations to Portuguese of standard \
'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2tsvn59883"

RPM_NAME = "texlive-babel-portuges-2023.209.1.2tsvn59883-54.1.noarch.rpm"
RPM_HASH = "4c619868b77a09093211bd06f3179251fa383841514b8a7a3a8208ede7fe7d776ab39f5e7ffe2a4abdd514b94c1142a8b22b7b550b6c9e94a0603e3f1eb2406b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-brazil.ldf \
tex-brazilian.ldf \
tex-portuges.ldf \
tex-portuguese.ldf \
texlive-babel-portuges"

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
