SUMMARY = "American Psychological Association format"
DESCRIPTION = "A LaTeX class to format text according to the American \
Psychological Association Publication Manual (5th ed.) \
specifications for manuscripts or to the APA journal look found \
in journals like the Journal of Experimental Psychology etc. In \
addition, it provides regular LaTeX-like output with a few \
enhancements and APA-motivated changes. Note that the apa7 \
class (covering the 7th edition of the manual) and apa6 \
(covering the 6th edition of the manual) are now commonly in \
use. Apacite, which used to work with this class, has been \
updated for use with apa6."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.4svn54080"

RPM_NAME = "texlive-apa-2023.201.1.3.4svn54080-54.1.noarch.rpm"
RPM_HASH = "165cc3e1a6629e7edc62e2871dd2176641c5704551e288167cdbb43a02df1d6ead2906ad2fc54410e92ecea5a7d690b06f5154a333df5710d2362a50c42b4df5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(apa.cls) \
texlive-apa"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(apacite.sty) \
tex(article.cls) \
tex(babel.sty) \
tex(bm.sty) \
tex(endfloat.sty) \
tex(endnotes.sty) \
tex(flushend.sty) \
tex(ftnright.sty) \
tex(longtable.sty) \
tex(mathptm.sty) \
tex(pslatex.sty) \
tex(times.sty) \
tex(txfonts.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
