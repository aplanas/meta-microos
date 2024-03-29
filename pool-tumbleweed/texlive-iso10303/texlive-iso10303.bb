SUMMARY = "Typesetting the STEP standards"
DESCRIPTION = "Class and package files building on iso for typesetting the ISO \
10303 (STEP) standards. Standard documents prepared using these \
packages have been published by ISO."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn15878"

RPM_NAME = "texlive-iso10303-2023.209.1.5svn15878-56.1.noarch.rpm"
RPM_HASH = "68bc8bfe25ea2657677afe06348198cd003997ebf51be247061e541309480301761ece1072342d543ded84b7e29844258d458a87d318fda99ad4e0fc9413b784"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aicv1.sty \
tex-apendint.tex \
tex-apmpspec.tex \
tex-apmptbl.tex \
tex-apmptempl.tex \
tex-apsstempl.tex \
tex-apv12.sty \
tex-atsv11.sty \
tex-bpfap1.tex \
tex-bpfap10.tex \
tex-bpfap11.tex \
tex-bpfap12.tex \
tex-bpfap13.tex \
tex-bpfap14.tex \
tex-bpfap15.tex \
tex-bpfap16.tex \
tex-bpfap2.tex \
tex-bpfap3.tex \
tex-bpfap4.tex \
tex-bpfap5.tex \
tex-bpfap6.tex \
tex-bpfap7.tex \
tex-bpfap8.tex \
tex-bpfap9.tex \
tex-bpfats1.tex \
tex-bpfats10.tex \
tex-bpfats11.tex \
tex-bpfats12.tex \
tex-bpfats14.tex \
tex-bpfats2.tex \
tex-bpfats3.tex \
tex-bpfats4.tex \
tex-bpfats5.tex \
tex-bpfats6.tex \
tex-bpfats7.tex \
tex-bpfats8.tex \
tex-bpfats9.tex \
tex-bpfir1.tex \
tex-bpfir2.tex \
tex-bpfir3.tex \
tex-bpfs1.tex \
tex-bpfs2.tex \
tex-bpfs3.tex \
tex-irv12.sty \
tex-stepman.tex \
tex-stepv13.sty \
tex-stppdlst.tex \
texlive-iso10303"

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
