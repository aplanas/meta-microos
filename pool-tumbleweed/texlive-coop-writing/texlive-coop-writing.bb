SUMMARY = "Support for Cooperative Writing and editorial comments"
DESCRIPTION = "This package for Cooperative Writing supports editorial \
comments and gives some extra support for writing and \
submitting papers, such as anonymization commands for any \
document that involves more than one author or editor. The \
general behavior of this package is to provide different ways \
of marking your text, for example with comments or to-do-notes, \
suggestions to add, remove or change text that can be totally \
supressed from the output when desired. Mostly, this can be \
easily done using one of the three main option states: editing, \
submit, and publish. Users should use the editing state most of \
the time. In this state, all markings will appear and \
anonymization will be off. When submitting, the submit state \
will provide a clean article, without any markings, but \
anonymized. It is possible to use the options submit and \
noanonymize together. Publish will never anonymize. The goal is \
to make the submit and publish documents states minimally \
invasive, to avoid any clash with publishers' styles. Commands \
were inspired from different packages that do not work together \
very well, such as ed, todonotes, and color-edits."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.4svn61607"

RPM_NAME = "texlive-coop-writing-2023.209.1.2.4svn61607-55.1.noarch.rpm"
RPM_HASH = "3df74590ad710f2bf16169e9f5d81daaa9f393f60a7040f1e8dc16d27e299e61a59d83693b3e7fc7f3980cc088197c5005943ffa8822e83e61475fbda466572f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coop-writing.sty \
texlive-coop-writing"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-csquotes.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-iflang.sty \
tex-mdframed.sty \
tex-soulutf8.sty \
tex-tocloft.sty \
tex-ulem.sty \
tex-verbatim.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
