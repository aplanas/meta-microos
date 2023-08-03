SUMMARY = "Easy text-style subscripts in math mode"
DESCRIPTION = "This LaTeX package gives easy access to text-style subscripts \
in math mode by providing an optional argument to _. This is \
implemented by using the \\text{} command from the amstext \
package."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn51273"

RPM_NAME = "texlive-subtext-2023.209.1.1svn51273-58.1.noarch.rpm"
RPM_HASH = "e12bc31d771c79880b315547f65e5ae0382cc86b5ea416984108e60136354de54bff2e74f8ae14278e3536289e087c4ecbcd206d056c19840f65e8f396e17f3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subtext.sty \
texlive-subtext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
