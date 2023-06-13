SUMMARY = "Bulgarian translation of the 'Short Introduction to LaTeX2e'"
DESCRIPTION = "The source files, PostScript and PDF files of the Bulgarian \
translation of the 'Short Introduction to LaTeX 2e'."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-lshort-bulgarian-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "2f5ffe3b5022594d7f136f9caa1bab99f57887ac90d1f220f20e51ece356410eedaa80a992e077ea8c97607ce1487f992e96fc046d7b502f0debaced152c728f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-bulgarian"

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
