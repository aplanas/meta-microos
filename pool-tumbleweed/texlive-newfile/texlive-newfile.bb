SUMMARY = "User level management of LaTeX input and output"
DESCRIPTION = "Commands are defined to manage the limited pool of input and \
output handles provided by TeX. The streams so provided are \
mapped to various of the LaTeX input and output mechanisms. \
Some facilities of the verbatim package are also mapped."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0csvn15878"

RPM_NAME = "texlive-newfile-2023.209.1.0csvn15878-55.1.noarch.rpm"
RPM_HASH = "6104a52e73174bc5293cf782078274121fbd31b566675fe875acc2cdfa86ae5710d429d5f8ed4df63b501148654675c3e55b0aae46593bbd13d61cbe97a662b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newfile.sty \
texlive-newfile"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
