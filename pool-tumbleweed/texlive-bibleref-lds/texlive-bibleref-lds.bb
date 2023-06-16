SUMMARY = "Bible references, including those to the scriptures of the Church of Jesus Christ of Latter Day Saints"
DESCRIPTION = "The package extends the bibleref-mouth package to support \
references to the scriptures of The Church of Jesus Christ of \
Latter-day Saints (LDS). The package requires bibleref-mouth to \
run, and its reference syntax is the same as that of the parent \
package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn25526"

RPM_NAME = "texlive-bibleref-lds-2023.201.1.0svn25526-53.1.noarch.rpm"
RPM_HASH = "1f9160020fe8916110b7e914932739e6dd15536456a012d81557897e74d01c596cc486afacbb5a5d9bf20eb39a1e786215d11a9a45dcfeb2f808dc4027a9467e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibleref-lds.sty \
texlive-bibleref-lds"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bibleref-mouth.sty \
tex-hyperref.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
