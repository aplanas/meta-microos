SUMMARY = "Assembling beamer frames according to audience"
DESCRIPTION = "The Beamer Audience package provides macros to easily assemble \
frames according to different audiences. It enables to pick up \
the frames for a specific audience while leaving their order \
according to a logical structure in the LaTeX source."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn23427"

RPM_NAME = "texlive-beameraudience-2023.201.0.0.1svn23427-53.1.noarch.rpm"
RPM_HASH = "31166ae4d1df5d710e1419ae99ba5cadfe84d478dea7b0000c155e7e8c2ccc297fa02d3bbc85810e0d2245b9aaf59c385d6552249fb5a26d0df18cdabefd3e91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beameraudience.sty) \
texlive-beameraudience"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(cprotect.sty) \
tex(ifthen.sty) \
tex(kvoptions.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
