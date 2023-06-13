SUMMARY = "Extra control of appendices"
DESCRIPTION = "The appendix package provides various ways of formatting the \
titles of appendices. Also (sub)appendices environments are \
provided that can be used, for example, for per chapter/section \
appendices. The word 'Appendix' or similar can be prepended to \
the appendix number for article class documents. The word \
'Appendices' or similar can be added to the table of contents \
before the appendices are listed. The word 'Appendices' or \
similar can be typeset as a \\part-like heading (page) in the \
body. An appendices environment is provided which can be used \
instead of the \\appendix command."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2csvn53718"

RPM_NAME = "texlive-appendix-2023.201.1.2csvn53718-54.1.noarch.rpm"
RPM_HASH = "6143d16b4913453607ae179acd9666b169aa37f1a371f499212692878070cf33e7b1f72aafa579798f5f15ce9b3773e38ddca018c40f29946c920a637009ace4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(appendix.sty) \
texlive-appendix"

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
