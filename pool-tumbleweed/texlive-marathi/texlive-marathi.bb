SUMMARY = "Typeset Marathi language using XeLaTeX or LuaLaTeX"
DESCRIPTION = "luaa-laattek v jhii-laattek hyaaNcyaash mraatthiicaa sulbh \
vaapr krnnyaasaatthii. laattek-vriil mraatthiicyaa \
sthaanikiikrnnaace kaam hyaa aajnyaasNcaamaarpht kele jaaiil. \
expex v blindtext hyaa aajnyaasNcaaNce sthaanikiikrnn tuurtaas \
hyaa aajnyaasNcaamaarpht purvle jaat aahe. For conveniently \
typesetting Marathi language with LuaLaTeX and XeLaTeX. This \
package will provide localizations needed for the Marathi \
language. Currently the package localizes package blindtext and \
package expex."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.7svn61719"

RPM_NAME = "texlive-marathi-2023.201.1.7svn61719-52.1.noarch.rpm"
RPM_HASH = "76c86c89c6d53baccb98448887b1fbea0109947571fa4153088379b2018ad59f8c46f7aac96178bd9136d9a864eb01f8e48e0a46e04d6b6285f94ae2676007e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-marathi.sty \
tex-namuna-article.tex \
tex-namuna-beamer.tex \
tex-namuna-book.tex \
tex-namuna-letter.tex \
tex-namuna-para.tex \
tex-namuna-report.tex \
texlive-marathi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-csquotes.sty \
tex-fontspec.sty \
tex-iftex.sty \
tex-pgfkeys.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
