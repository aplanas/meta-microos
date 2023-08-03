SUMMARY = "Extended BibTeX citation support for the humanities and legal texts"
DESCRIPTION = "This package enables automated citation with BibTeX for legal \
studies and the humanities. In addition, the package provides \
commands for specifying editors in a commentary in a convenient \
way. Simplified formatting of the citation as well as the \
bibliography entry is also provided. It is possible to display \
the (short) title of a work only if an authors is cited with \
multiple works. Giving a full citation in the text, conforming \
to the bibliography entry, is supported. Several options are \
provided which might be of special interest for those outside \
legal studies--for instance, displaying multiple full \
citations. In addition, the format of last names and first \
names of authors may be changed easily. Cross references to \
other footnotes are possible. Language dependent handling of \
bibliography entries is possible by the special language field."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.6svn15878"

RPM_NAME = "texlive-jurabib-2023.209.0.0.6svn15878-56.1.noarch.rpm"
RPM_HASH = "1ba81c887c47836a94cd7a495344653114388489e9bdf07e275140d5b942de9a68f0c0723ba8221a6d706082d43ab0a9f9f426715be6ea1c625ea1441b18dc72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dajbbib.ldf \
tex-dejbbib.ldf \
tex-dujbbib.ldf \
tex-enjbbib.ldf \
tex-fijbbib.ldf \
tex-frjbbib.ldf \
tex-itjbbib.ldf \
tex-jblong.cfg \
tex-jurabib.cfg \
tex-jurabib.sty \
tex-nojbbib.ldf \
tex-ptjbbib.ldf \
tex-spjbbib.ldf \
texlive-jurabib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-bibunits.sty \
tex-calc.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
