SUMMARY = "A sample document in Plain TeX"
DESCRIPTION = "A file written with TeX, not using any packgages or sty-files, \
to be compiled with TeX or pdfTeX only, not with LaTeX et al."
LICENSE = "LPPL-1.0"

PV = "2023.209.2svn50985"

RPM_NAME = "texlive-texonly-2023.209.2svn50985-55.1.noarch.rpm"
RPM_HASH = "6b228e8de9f074e46f4a69f8cc7401c2fee40420dad5cac73588d741042d01db60475a70f75817f879e7422f508fcf10ff0f5812ff724370e17427e6234f973c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texonly"

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
