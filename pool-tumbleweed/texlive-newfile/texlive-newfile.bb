SUMMARY = "User level management of LaTeX input and output"
DESCRIPTION = "Commands are defined to manage the limited pool of input and \
output handles provided by TeX. The streams so provided are \
mapped to various of the LaTeX input and output mechanisms. \
Some facilities of the verbatim package are also mapped."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0csvn15878"

RPM_NAME = "texlive-newfile-2023.201.1.0csvn15878-54.1.noarch.rpm"
RPM_HASH = "679afca8475bcea20a86deb762f01ec11d1d12a452f06711cce9dab8bbafdcb6f34f6f8fa03a98e2abc2f852ab93f5b00dec6ae6abfc6c9f13d739d667cab3e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(newfile.sty) \
texlive-newfile"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(verbatim.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
