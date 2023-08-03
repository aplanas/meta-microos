SUMMARY = "Make author, etc., available after \\maketitle"
DESCRIPTION = "This jiffy package makes the author, title and date of the \
package available to the user (as \\MyAuthor, etc) after the \
\\maketitle command has been executed."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn55889"

RPM_NAME = "texlive-authoraftertitle-2023.209.1.0svn55889-54.1.noarch.rpm"
RPM_HASH = "4fecfa9437c59fce2242727b8f4797f2c49f97d024d9bbd06efe106fc89fce590ac5bdecdf5be5321f558998f4f90888d562f190f6a5f4df072e7c63047c717e"
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
