SUMMARY = "Chicago style files for BibLaTeX"
DESCRIPTION = "This is a BibLaTeX style that implements the Chicago \
'author-date' and 'notes with bibliography' style \
specifications given in the Chicago Manual of Style, 17th \
edition (with continuing support for the 16th edition, too). \
The style implements entry types for citing audio-visual \
materials, among many others. The package was previously known \
as biblatex-chicago-notes-df."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3asvn65037"

RPM_NAME = "texlive-biblatex-chicago-2023.209.2.3asvn65037-54.1.noarch.rpm"
RPM_HASH = "527cb9d94a2a4da44684556c82ac9860544916edffde74841a338f3a3bab990d15bee2774e56bcec1be369b5600d4534130255ec69488e4dff11f041432a31cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-chicago.sty \
tex-chicago-authordate-trad.bbx \
tex-chicago-authordate-trad.cbx \
tex-chicago-authordate-trad16.bbx \
tex-chicago-authordate-trad16.cbx \
tex-chicago-authordate.bbx \
tex-chicago-authordate.cbx \
tex-chicago-authordate16.bbx \
tex-chicago-authordate16.cbx \
tex-chicago-dates-common.cbx \
tex-chicago-dates-common16.cbx \
tex-chicago-notes.bbx \
tex-chicago-notes.cbx \
tex-chicago-notes16.bbx \
tex-chicago-notes16.cbx \
tex-cms-american.lbx \
tex-cms-brazilian.lbx \
tex-cms-british.lbx \
tex-cms-dutch.lbx \
tex-cms-finnish.lbx \
tex-cms-french.lbx \
tex-cms-german.lbx \
tex-cms-icelandic.lbx \
tex-cms-ngerman.lbx \
tex-cms-norsk.lbx \
tex-cms-norwegian.lbx \
tex-cms-nynorsk.lbx \
tex-cms-romanian.lbx \
tex-cms-spanish.lbx \
tex-cms-swedish.lbx \
tex-cmsdocs.sty \
tex-cmsendnotes.sty \
texlive-biblatex-chicago"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biblatex.sty \
tex-endnotes.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-listings.sty \
tex-nameref.sty \
tex-refcount.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
