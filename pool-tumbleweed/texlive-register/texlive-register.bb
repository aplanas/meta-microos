SUMMARY = "Typeset programmable elements in digital hardware (registers)"
DESCRIPTION = "This package is designed for typesetting the programmable \
elements in digital hardware, i.e., registers. Such registers \
typically have many fields and can be quite wide; they are thus \
a challenge to typeset in a consistent manner. Register is \
similar in some aspects to the bytefield and bitpattern \
packages. Anyone doing hardware documentation using LaTeX \
should examine those packages. Register requires version \
2001/07/25 or newer of the float package. An example Perl \
module and script are provided, to convert the register \
specifications into structures suitable for, say, a pre-silicon \
test environment."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn54485"

RPM_NAME = "texlive-register-2023.201.2.0svn54485-53.2.noarch.rpm"
RPM_HASH = "5d3765b297df7ac4759bd7517e11944e6936dab387357da9e6e58cff9bfd2ab9275c940531bac7b1373d8046276091504732044a43ef1dcdf8739a6a79617d31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-register.sty \
texlive-register"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-float.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
