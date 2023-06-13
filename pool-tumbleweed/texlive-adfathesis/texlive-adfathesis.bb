SUMMARY = "Australian Defence Force Academy thesis format"
DESCRIPTION = "The bundle includes a BibTeX style file."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.42svn26048"

RPM_NAME = "texlive-adfathesis-2023.201.2.42svn26048-54.1.noarch.rpm"
RPM_HASH = "c3e6f73bed7cafc37b55611b70d2464c2b3eaf9a0f17cc6e37d5ff819d8363eae4e5ab2ab56f40973d68de5370b60ee7bd99bcbe052764f76ef39042fd9fb47c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(adfathesis.cls) \
texlive-adfathesis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(harvard.sty) \
tex(report.cls) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
