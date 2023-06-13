SUMMARY = "Manipulate the graphics package's list of extensions"
DESCRIPTION = "This package provides macros for adding to, and reordering the \
list of graphics file extensions recognised by package \
graphics."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn53024"

RPM_NAME = "texlive-grfext-2023.201.1.3svn53024-53.1.noarch.rpm"
RPM_HASH = "4bc50c22f53140ab9619a8e0fd9281d9771b9d75f225871d0a4b5b36964772de437e2bd55f0b46d971cf97932daaa449b7e7382029b9203f23ca29571e5d1ec4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(grfext.sty) \
texlive-grfext"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(infwarerr.sty) \
tex(kvdefinekeys.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
