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

PV = "2023.209.2.0svn54485"

RPM_NAME = "texlive-register-2023.209.2.0svn54485-54.2.noarch.rpm"
RPM_HASH = "5fe4a4020fd0bd482c395fd7478795320b01c4c9c4277d2ca4e2a93e2a97fc08f74a7c6910f00b4912f2db1ffce5db81baeee77619d8361006e1f41128237476"
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
