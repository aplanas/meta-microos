SUMMARY = "Typeset Python, C and Pascal programs"
DESCRIPTION = "A TeX macro package for easy typesetting programs in Python, C \
and Pascal. Program source files may also be input."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.2svn18337"

RPM_NAME = "texlive-c-pascal-2023.209.1.2svn18337-53.1.noarch.rpm"
RPM_HASH = "d9592735a5490c83df527f59d3be4dbb71fbe304813b1a1efd25de4fb9e38df73ee0a3bf5dc49af77c066b64385142fd95d57f1ba7254be44cff31722c11669f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cap-c.tex \
tex-cap-comm.tex \
tex-cap-pas.tex \
tex-cap-pyt.tex \
tex-cap.tex \
texlive-c-pascal"

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
