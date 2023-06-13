SUMMARY = "Prepare papers for the journal Nature"
DESCRIPTION = "Nature does not accept papers in LaTeX, but it does accept PDF. \
This class and BibTeX style provide what seems to be necessary \
to produce papers in a format acceptable to the publisher."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn21819"

RPM_NAME = "texlive-nature-2023.201.1.0svn21819-54.1.noarch.rpm"
RPM_HASH = "a9fc03e772ed248e201395cb2d535517058936fd3e494955d88f36b0999c45564581a439a081c858e0339bb2e2b5986a59a16b90f98eb3c68d6d2ffe9e21ad3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nature.cls) \
texlive-nature"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
tex(cite.sty) \
tex(fullpage.sty) \
tex(ifthen.sty) \
tex(times.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
