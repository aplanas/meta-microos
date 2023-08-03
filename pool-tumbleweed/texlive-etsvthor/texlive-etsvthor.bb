SUMMARY = "Some useful abbreviations for members of e.t.s.v. Thor"
DESCRIPTION = "'e.t.s.v. Thor' stands for 'Elektrotechnische Studievereniging \
Thor', a study association of Electrical Engeering at the \
Eindhoven University of Technology. The author of the package \
tells us: 'Most of our committees use LaTeX to create meeting \
notes or other formal documents within the association. When \
you create a lot of these documents (which I do a lot, since I \
am currently the candidate Secretary of the new board), some \
abbreviations are extremely useful. I discovered that more \
people from our association are interested in using these, so I \
decided to put them in a package, so they can use it very \
easily too.'"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn48186"

RPM_NAME = "texlive-etsvthor-2023.209.1.0svn48186-53.1.noarch.rpm"
RPM_HASH = "b32d36da646595e376e7cd22fe91dfd4054585b1b452b58e9f1f667f68346ff6f8335aee5f472b1a52a86abdcd9801e302c5f83c318a2307c5daf492eeae11d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-etsvthor.sty \
texlive-etsvthor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-epsfig.sty \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
