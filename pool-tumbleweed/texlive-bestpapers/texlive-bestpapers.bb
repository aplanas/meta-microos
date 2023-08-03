SUMMARY = "A BibTeX package to produce lists of authors' best papers"
DESCRIPTION = "Many people preparing their resumes find the requirement \
'please list five (or six, or ten) papers authored by you'. The \
same requirement is often stated for reports prepared by \
professional teams. The creation of such lists may be a \
cumbersome task. Even more difficult is it to support such \
lists over the time, when new papers are added. The BibTeX \
style bestpapers.bst is intended to facilitate this task. It is \
based on the idea that it is easier to score than to sort: We \
can assign a score to a paper and then let the computer select \
the papers with highest scores. This work was commissioned by \
the Consumer Financial Protection Bureau, United States \
Treasury. This package is in the public domain."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn38708"

RPM_NAME = "texlive-bestpapers-2023.209.1.0svn38708-54.1.noarch.rpm"
RPM_HASH = "d1b1516427a583141850b390aa1dbef328a9530a47ce63822fff0768f81408a43b59d0cf109c98fef4a8a1ade5071591a2e71d1b71ec04feeffbf92a01d1b90c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bestpapers"

RDEPENDS:${PN} += "/usr/bin/sh \
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
