SUMMARY = "Basic support for multiple languages in Plain TeX"
DESCRIPTION = "The package offers a means to set up hyphenation suitable for \
several languages and/or dialects, and to select them or switch \
between them while typesetting."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-hyplain-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "a52fa2063d6f077c2f747824324ef562cf61812d8312b34d9e8c746bb7cdd233efbb50561d189d445fdb3f2df062acdd868a00a42749f23f7fac4651f4dc7517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hylang.tex \
tex-hyplain.tex \
tex-hyrules.tex \
texlive-hyplain"

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
