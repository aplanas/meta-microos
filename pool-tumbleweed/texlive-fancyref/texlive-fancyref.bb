SUMMARY = "A LaTeX package for fancy cross-referencing"
DESCRIPTION = "Provides fancy cross-referencing support, based on the \
package's reference commands (\\fref and \\Fref) that recognise \
what sort of object is being referenced. So, for example, the \
label for a \\section would be expected to be of the form \
'sec:foo': the package would recognise the 'sec:' part."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.9csvn15878"

RPM_NAME = "texlive-fancyref-2023.209.0.0.9csvn15878-53.1.noarch.rpm"
RPM_HASH = "cf184816ac764929535ce009a1e7b7ec73b45cb3a5f683e75a00884452e1bb803846570a88c116144977da24e2865f56830b6dc06a97dc77b153a2200e898d4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancyref.sty \
texlive-fancyref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-varioref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
