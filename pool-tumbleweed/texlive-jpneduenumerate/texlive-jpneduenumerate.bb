SUMMARY = "Enumerative expressions in Japanese education"
DESCRIPTION = "Mathematical equation representation in Japanese education \
differs somewhat from the standard LaTeX writing style. This \
package introduces enumerative expressions in Japanese \
education."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn63893"

RPM_NAME = "texlive-jpneduenumerate-2023.209.1.2svn63893-56.1.noarch.rpm"
RPM_HASH = "aaf4a5aaa1eaae1d4a8aeccd9925691e6364ed1a630965cb5951951458225c5e37b98c897a35a71c4ab872080331e205f35d7e8f0e2c737efdbaf2391a90cd5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jpneduenumerate.sty \
texlive-jpneduenumerate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-enumitem.sty \
tex-luatexja-otf.sty \
tex-otf.sty \
tex-refcount.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
