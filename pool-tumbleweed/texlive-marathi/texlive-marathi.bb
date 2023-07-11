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

PV = "2023.208.1.7svn61719"

RPM_NAME = "texlive-marathi-2023.208.1.7svn61719-53.1.noarch.rpm"
RPM_HASH = "1d46cd654e315d6321bd317d4c22fe7dc569a99b2bef5f376d9803fcdaecfc1142844496753b90f2cdd4b9da3c1fe7cce343b4d30f0f80e9e2bb100ac12da7f4"
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
