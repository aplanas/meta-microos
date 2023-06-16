SUMMARY = "Make author, etc., available after \\maketitle"
DESCRIPTION = "This jiffy package makes the author, title and date of the \
package available to the user (as \\MyAuthor, etc) after the \
\\maketitle command has been executed."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn55889"

RPM_NAME = "texlive-authoraftertitle-2023.201.1.0svn55889-53.1.noarch.rpm"
RPM_HASH = "41b151c83e3a43d2de488460e0e72dc713bbb95e2cad812f680bb70cb2961377d71c1cf5dd2be2a309a08198f87bf993c84e30c26bb7c6659d232ddc67704e26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-authoraftertitle.sty \
texlive-authoraftertitle"

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
