SUMMARY = "Tools to load and manipulate data"
DESCRIPTION = "The tools comprise six packages: datatool.sty: databases may be \
created using LaTeX commands or by importing external files; \
they may be sorted numerically or alphabetically; repetitive \
operations (such as mail merging) may be performed on each row \
of a database, subject to conditions to exclude particular \
rows; commands are provided to examine database elements, and \
to convert formats (for example, to convert a numeric element \
to a format compatible with the fp package; datapie.sty: a \
database may be represented as a pie chart; flexible options \
allow colouring of the chart, and annotation hooks are \
available; dataplot.sty: a database may be represented as a \
2-dimensional scatter or line plot; flexible options control of \
the plot's overall appearance, and of legends and other extra \
information; databar.sty: a database may be represented as a \
bar chart; overall appearance, colouring and annotation are \
controllable; datagidx.sty: provides a way of indexing or \
creating glossaries/lists of acronyms that uses TeX to do the \
sorting and collating instead of using an external indexing \
application, such as xindy or makeindex; databib.sty: a \
bibliography may be loaded into a datatool database, and \
manipulated there before being printed (this permits a \
LaTeX-based route to printing bibliographies in formats for \
which no BibTeX style is available); and person.sty: provides \
support for displaying a person's name and pronoun in a \
document, thus avoiding cumbersome use of 'he/she', etc. The \
drawing packages make use of PGF/TikZ for their output. The \
bundle supersedes and replaces the author's csvtools bundle."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.32svn52663"

RPM_NAME = "texlive-datatool-2023.209.2.32svn52663-55.1.noarch.rpm"
RPM_HASH = "43fc42c19362092407414c69579687d1890aecef69b7a59d661b55334c1a910e773756b237dd086cf62ce6585db9afc359912133390b7d4547fa730d91982b3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-databar.sty \
tex-databib.sty \
tex-datagidx.sty \
tex-datapie.sty \
tex-dataplot.sty \
tex-datatool-base.sty \
tex-datatool-fp.sty \
tex-datatool-pgfmath.sty \
tex-datatool.sty \
tex-person.sty \
texlive-datatool"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-amsmath.sty \
tex-etoolbox.sty \
tex-fp.sty \
tex-ifthen.sty \
tex-mfirstuc.sty \
tex-multicol.sty \
tex-pgfkeys.sty \
tex-pgfmath.sty \
tex-pgfrcs.sty \
tex-substr.sty \
tex-textcase.sty \
tex-tikz.sty \
tex-xfor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-fp \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-substr \
texlive-xfor \
texlive-xkeyval"

inherit rpm
