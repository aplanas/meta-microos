SUMMARY = "Versions of article class, tuned for scholarly publications"
DESCRIPTION = "A pair of classes derived from article, tuned for producing \
papers for journals. The classes introduce new layout options \
and font commands for sections/parts, and define a new keywords \
environment, subtitle and institution commands for the title \
section and new commands for revisions."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0lsvn34521"

RPM_NAME = "texlive-paper-2023.201.1.0lsvn34521-51.1.noarch.rpm"
RPM_HASH = "5a3691a7710b194d378acc13a56fa6b0be967e8c9c65095c7e68cb995e9ac22f5c95c0fcd438f8378710b5469bc374a192c7b20ef92cdb6be290a7ef7be84e4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-journal.cls \
tex-journal.sty \
tex-paper.cls \
tex-paper.sty \
texlive-paper"

RDEPENDS:${PN} += "/bin/sh \
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
