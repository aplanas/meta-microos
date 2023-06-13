SUMMARY = "Macros for building proof trees"
DESCRIPTION = "A package to typeset proof trees for natural deduction calculi, \
sequent-like calculi, and similar."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.6svn54080"

RPM_NAME = "texlive-prftree-2023.201.1.6svn54080-52.1.noarch.rpm"
RPM_HASH = "20ff97b799715a8a594a8e5a7b874c0c78a22080492dbba32548ddaac67fd36a72ceb2971b7daac3e03b654c5e276ad0c520cc2219f50a1407c955db352cea01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(prftree.sty) \
texlive-prftree"

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
