SUMMARY = "Easy text-style subscripts in math mode"
DESCRIPTION = "This LaTeX package gives easy access to text-style subscripts \
in math mode by providing an optional argument to _. This is \
implemented by using the \\text{} command from the amstext \
package."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn51273"

RPM_NAME = "texlive-subtext-2023.201.1.1svn51273-57.1.noarch.rpm"
RPM_HASH = "b88923daaf0a1bef23fcd0a0f04f338c5f1e812643428e21011eee7e8f8d6b5bc749b748a28a6ece61d23b3864f345667c44492d36c0c16a4e8389263ce57e3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subtext.sty \
texlive-subtext"

RDEPENDS:${PN} += "/bin/sh \
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
