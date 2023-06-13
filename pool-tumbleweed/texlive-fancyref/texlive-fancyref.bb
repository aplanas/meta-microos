SUMMARY = "A LaTeX package for fancy cross-referencing"
DESCRIPTION = "Provides fancy cross-referencing support, based on the \
package's reference commands (\\fref and \\Fref) that recognise \
what sort of object is being referenced. So, for example, the \
label for a \\section would be expected to be of the form \
'sec:foo': the package would recognise the 'sec:' part."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.9csvn15878"

RPM_NAME = "texlive-fancyref-2023.201.0.0.9csvn15878-52.1.noarch.rpm"
RPM_HASH = "d0e31b6d27009a499a4124da74a864be4334384103c480ec3072ce2cdba66734333b067814cbd83b564a527261efbfe00f5154c4ee983c4545d7c2c0edbec9b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fancyref.sty) \
texlive-fancyref"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(varioref.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
