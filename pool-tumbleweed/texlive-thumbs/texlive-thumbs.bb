SUMMARY = "Create thumb indexes"
DESCRIPTION = "The package puts running, customizable thumb marks in the outer \
margin, moving downward as the chapter number (or whatever \
shall be marked by the thumb marks) increases. Additionally an \
overview page/table of thumb marks can be added automatically, \
which gives the names of the thumbed objects, the page where \
the object/thumb mark first appears, and the thumb mark itself \
at its correct position. The thumb marks are useful for large \
documents (such as reference guides, anthologies, etc.), where \
a quick and easy way to find (for example) a chapter is needed."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0qsvn33134"

RPM_NAME = "texlive-thumbs-2023.209.1.0qsvn33134-55.1.noarch.rpm"
RPM_HASH = "a334477749eed6d5599cb5fd9f4e67f31148d6f5b39b7b7cd7bd4b7d60ed949cde89daaa91047da58398e7a85e4b97ac75ab567dc37268512a02497ba83194c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thumbs.sty \
texlive-thumbs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphalph.sty \
tex-amsfonts.sty \
tex-atbegshi.sty \
tex-atveryend.sty \
tex-cellspace.sty \
tex-fontenc.sty \
tex-infwarerr.sty \
tex-kvoptions.sty \
tex-ltxcmds.sty \
tex-pagecolor.sty \
tex-pageslts.sty \
tex-picture.sty \
tex-rerunfilecheck.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
