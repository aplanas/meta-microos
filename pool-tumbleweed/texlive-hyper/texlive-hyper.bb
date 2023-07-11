SUMMARY = "Hypertext cross referencing"
DESCRIPTION = "Redefines LaTeX cross-referencing commands to insert \\special \
commands for HyperTeX dvi viewers, such as recent versions of \
xdvi. The package is now largely superseded by hyperref."
LICENSE = "LPPL-1.0"

PV = "2023.208.4.2dsvn17357"

RPM_NAME = "texlive-hyper-2023.208.4.2dsvn17357-53.1.noarch.rpm"
RPM_HASH = "caae8ab2e6f0be535d80c18d973abf86ad852962ce087d33f8230b166306771727650d42234ddfcb50acd5f631b635443d99c3229e660134e021817f0ff70319"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hxt-bc.sty \
tex-hyper.sty \
texlive-hyper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-defpattern.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
