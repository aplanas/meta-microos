SUMMARY = "Comprehensive LaTeX support for French-language typesetting"
DESCRIPTION = "E-french is a distribution that keeps alive the work of Bernard \
Gaulle (now deceased), under a free licence. It replaces the \
old 'full' frenchpro (the 'professional' distribution) and the \
light-weight frenchle packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.6.11svn52027"

RPM_NAME = "texlive-e-french-2023.201.6.11svn52027-53.2.noarch.rpm"
RPM_HASH = "c44880702aaec3626bb4d4e3b31d3ed826ff5a330bc05eb8c706e82ddf84560adcf8928e0b9e577457e602a2a9c1d74e69e3dbba194de82fb5543b99072d9abe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-efrench.sty \
tex-efrenchu.tex \
tex-epreuve.sty \
tex-fenglish.sty \
tex-frabbrev-u8.tex \
tex-frabbrev.tex \
tex-french-french-msg.tex \
tex-french-msg.tex \
tex-french.cfg \
tex-french.sty \
tex-frenchle.cfg \
tex-frenchle.sty \
tex-frenchpro.sty \
tex-frhyphex.tex \
tex-fxabbrev.tex \
tex-german-french-msg.tex \
tex-mlp-01.sty \
tex-mlp-33.sty \
tex-mlp-49.sty \
tex-mlp-49n.sty \
tex-mlp-opts.sty \
tex-mlp.sty \
tex-pmfrench.sty \
texlive-e-french"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-german.sty \
tex-latexsym.sty \
tex-msg.sty \
tex-ngerman.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
