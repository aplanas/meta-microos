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

PV = "2023.201.1.0svn38708"

RPM_NAME = "texlive-bestpapers-2023.201.1.0svn38708-53.1.noarch.rpm"
RPM_HASH = "55d20d184df8823acebfc8c2099130574d5b2d224d6f20ec417cf093c4818ea1656671f96af57b1cb1d53aaecc03a062ae8ecf5837490b312bf1c221e57e2de6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bestpapers"

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
