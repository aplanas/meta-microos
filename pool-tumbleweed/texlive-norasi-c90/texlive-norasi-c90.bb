SUMMARY = "TeX support (from CJK) for the norasi font"
DESCRIPTION = "The norasi-c90 package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn60831"

RPM_NAME = "texlive-norasi-c90-2023.201.svn60831-54.1.noarch.rpm"
RPM_HASH = "ca21c68e0869456672ae9251b6f34bfc2e3b4566f22e78717ee96267c0c7fe8a8c686cbc7163ff9236e0908c26c85aefba6061ca2f6929e79731ef6b34134477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ftnb8z.tfm) \
tex(ftnbi8z.tfm) \
tex(ftni8z.tfm) \
tex(ftnr8z.tfm) \
tex(norasi-c90.map) \
texlive-norasi-c90"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-fonts-tlwg \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
