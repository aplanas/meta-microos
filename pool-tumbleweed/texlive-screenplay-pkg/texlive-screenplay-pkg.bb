SUMMARY = "Package version of the screenplay document class"
DESCRIPTION = "This package implements the tools of the screenplay document \
class in the form of a package so that screenplay fragments can \
be included within another document class. For full \
documentation of the available commands, please consult the \
screenplay class documentation in addition to the included \
package documentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn44965"

RPM_NAME = "texlive-screenplay-pkg-2023.209.1.1svn44965-54.1.noarch.rpm"
RPM_HASH = "9546902b0a1443baeb16a85d9a23cbd4bebfcb79663075e680c9f35a5dbe1035fee57b571ca656931ddf81dbb8f9af1f96919178169608b77883a93ee62facb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-screenplay-pkg.sty \
texlive-screenplay-pkg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
