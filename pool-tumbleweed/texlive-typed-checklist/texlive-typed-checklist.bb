SUMMARY = "Typesetting tasks, goals, milestones, artifacts, and more in LaTeX"
DESCRIPTION = "The main goal of this package is to provide means for \
typesetting checklists in a way that stipulates users to \
explicitly distinguish checklists for goals, for tasks, for \
artifacts, and for milestones -- i.e., the type of checklist \
entries. The intention behind this is that a user of the \
package is coerced to think about what kind of entries he/she \
adds to the checklist. This shall yield a clearer result and, \
in the long run, help with training to distinguish entries of \
different types."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn63445"

RPM_NAME = "texlive-typed-checklist-2023.209.2.1svn63445-53.1.noarch.rpm"
RPM_HASH = "168c4c867acbb234b8a6f70b5056fa382678f28135d5a0692d7a6bdd786d10e91de11f84fbf75d2269f3a811d3340d1f9690ba5b5082597c0b7ad4e64dbbe2eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-typed-checklist.sty \
texlive-typed-checklist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-asciilist.sty \
tex-bbding.sty \
tex-etoolbox.sty \
tex-marginnote.sty \
tex-tabularx.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xltabular.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
