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

PV = "2023.201.2.1svn63445"

RPM_NAME = "texlive-typed-checklist-2023.201.2.1svn63445-52.1.noarch.rpm"
RPM_HASH = "ad786c71a5a11d89cd8778d85662c13d7f52d760c5846d3b7e926c2929309c794a6d5600ff2748fd66d79132c60615981bb8a4a14947d4a440d4d7ba5cd709f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(typed-checklist.sty) \
texlive-typed-checklist"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(asciilist.sty) \
tex(bbding.sty) \
tex(etoolbox.sty) \
tex(marginnote.sty) \
tex(tabularx.sty) \
tex(xcolor.sty) \
tex(xkeyval.sty) \
tex(xltabular.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
