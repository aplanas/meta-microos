SUMMARY = "Adjust margins of text block"
DESCRIPTION = "The package provides the environment fullwidth, which sets the \
left and right margins in a simple way. There is no constraint \
about page breaks; if you are using the twoside mode, you can \
set the inner and outer margins to avoid the effects of the \
different margins."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn24684"

RPM_NAME = "texlive-fullwidth-2023.201.0.0.1svn24684-52.1.noarch.rpm"
RPM_HASH = "3f792a7bc67e92dc30bbfb2353beb55f21fce1a1c4a4537ea5e727bdd0179c41f724c541280e5e6c6d47e238c6e1d52432c62ddecd892f33dd942f6820521536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fullwidth.sty \
texlive-fullwidth"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-zref-abspage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
