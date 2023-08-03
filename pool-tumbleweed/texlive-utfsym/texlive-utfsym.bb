SUMMARY = "Provides various Unicode symbols"
DESCRIPTION = "This package provides various symbols from the Unicode in order \
to be able to use them originally in a school setting such as \
on worksheets."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9.0svn63076"

RPM_NAME = "texlive-utfsym-2023.209.0.0.9.0svn63076-54.1.noarch.rpm"
RPM_HASH = "d1c86ffac5eee615da1ddd928b0490d9a450098d72535e08e635fb3517d1fe34be4a3df774edfe071a3ce13d589af0fb23cb6605b1f76a2f6c0a8469d94b1184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-utfsym.sty \
texlive-utfsym"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-l3keys2e.sty \
tex-newunicodechar.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
