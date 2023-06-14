SUMMARY = "Merge text in TeX and LaTeX"
DESCRIPTION = "Repetetively produce documents from a fixed part and a variable \
part. Such an operation is commonly used as 'mail merge' to \
produce mail shots."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.01svn20677"

RPM_NAME = "texlive-textmerg-2023.201.2.01svn20677-54.1.noarch.rpm"
RPM_HASH = "981c6bacb28ec500c5383f2e97bb1bb4a3674df7e3d90444b5eaab0f89fb5c9fcf44f724c5cf7009f1e6aa2daa118ed592c54331a41af850da0f5abad3a02386"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-textmerg.sty \
texlive-textmerg"

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
