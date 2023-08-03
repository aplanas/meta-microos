SUMMARY = "Bibliography styles and miscellaneous files for pBibTeX"
DESCRIPTION = "These are miscellaneous files, including bibliography styles \
(.bst), for pBibTeX, which is a Japanese extended version of \
BibTeX contained in TeX Live. The bundle is a redistribution \
derived from the ptex-texmf distribution by ASCII MEDIA WORKS."
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn66085"

RPM_NAME = "texlive-pbibtex-base-2023.209.svn66085-52.1.noarch.rpm"
RPM_HASH = "4d496e88c95c38a98272323f3bf9a6ba0add6a61aa978c4138422880dea91ffa824a9c0103a07e0c10b198d131eed2724132fb6f5d5f78b5ce7b59e8a5046c6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pbibtex-base"

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
