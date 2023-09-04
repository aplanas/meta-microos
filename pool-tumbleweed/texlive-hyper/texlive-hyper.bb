SUMMARY = "Hypertext cross referencing"
DESCRIPTION = "Redefines LaTeX cross-referencing commands to insert \\special \
commands for HyperTeX dvi viewers, such as recent versions of \
xdvi. The package is now largely superseded by hyperref."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2dsvn17357"

RPM_NAME = "texlive-hyper-2023.209.4.2dsvn17357-54.1.noarch.rpm"
RPM_HASH = "f3f6befb7a14cd0165608f9fa6e12a2dc0a143ee917522aeea4a155235bc4f479ef7b18e49cd71378d2f660fbbfd226d59f92013e259ff61946c314847ab9f4b"
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
