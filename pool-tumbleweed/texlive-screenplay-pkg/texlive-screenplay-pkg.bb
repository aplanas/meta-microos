SUMMARY = "Package version of the screenplay document class"
DESCRIPTION = "This package implements the tools of the screenplay document \
class in the form of a package so that screenplay fragments can \
be included within another document class. For full \
documentation of the available commands, please consult the \
screenplay class documentation in addition to the included \
package documentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn44965"

RPM_NAME = "texlive-screenplay-pkg-2023.201.1.1svn44965-53.1.noarch.rpm"
RPM_HASH = "bca70df241412bfca9181cbc5e23eff6e4c490497984fa00824690c5af87d6454947f3e8276aac18d3f119ca5aadf81cc63224ba8d1e24ba5569d8900716e905"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(screenplay-pkg.sty) \
texlive-screenplay-pkg"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(setspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
