SUMMARY = "Comprehensive LaTeX support for French-language typesetting"
DESCRIPTION = "E-french is a distribution that keeps alive the work of Bernard \
Gaulle (now deceased), under a free licence. It replaces the \
old 'full' frenchpro (the 'professional' distribution) and the \
light-weight frenchle packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.6.11svn52027"

RPM_NAME = "texlive-e-french-2023.209.6.11svn52027-54.2.noarch.rpm"
RPM_HASH = "dfa3f8ab9dda5c64d10800ec61ecb01d6f77add023841d3730c255786ecf12353bc95d33715faec045c4fb999b018a0fa26f28e99778c3f8b06c35dbaff888ae"
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
