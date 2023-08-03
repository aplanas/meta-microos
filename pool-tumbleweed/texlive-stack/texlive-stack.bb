SUMMARY = "Tools to define and use stacks"
DESCRIPTION = "The package provides a small set of commands to implement \
stacks independently of TeX's own stack. As an example of how \
the stacks might be used, the documentation offers a small \
'relinput' package that implements the backbone of the import \
package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00svn15878"

RPM_NAME = "texlive-stack-2023.209.1.00svn15878-58.1.noarch.rpm"
RPM_HASH = "48c2b25e23a9d3aa1fd358a7431d4a90dac08747652dd3dfabdd2d6569960459e3c5266904b5ad4fdefd330e8f54482043c235d71819098cfa9bef0b03e3c9fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-relinput.sty \
tex-stack.sty \
texlive-stack"

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
