SUMMARY = "An easy way to create Decision Model and Notation decision tables"
DESCRIPTION = "The decision-table package allows for an easy way to generate \
decision tables in the Decision Model and Notation (DMN) \
format. This package ensures consistency in the tables (i.e. \
fontsize), and is thus a better alternative to inserting tables \
via images. The decision-table package adds the \\dmntable \
command, with which tables can be created. This command expands \
into a tabular, so it can be used within a table or figure \
environment. Furthermore, this allows labels and captions to be \
added seamlessly. It is also possible to place multiple DMN \
tables in one table/figure environment. The package relies on \
nicematrix and l3keys2e."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.4svn60673"

RPM_NAME = "texlive-decision-table-2023.209.0.0.0.4svn60673-53.1.noarch.rpm"
RPM_HASH = "f2fce85c87eb67b360b88c864d7044f5cbc39994f656445f20612f8dbfc68b833050dc693d2f643ea83ce6db6f0f48efc769655d506249ab80cb899bd215c9a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-decision-table.sty \
texlive-decision-table"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-nicematrix.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
