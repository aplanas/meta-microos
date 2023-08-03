SUMMARY = "Prints the version and date of a LaTeX class or style file"
DESCRIPTION = "This simple shell script prints the version and date of a LaTeX \
class or style file. Syntax: latexfileversion <file> This \
programme handles style files (extension .sty), class files \
(extension .cls), and other TeX input files. The file extension \
must be given."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn29349"

RPM_NAME = "texlive-latexfileversion-2023.209.0.0.3svn29349-55.1.noarch.rpm"
RPM_HASH = "e35b5d7fb292745577b06ecf7499f0d66c4d689bdad64f6d592fcd5ec219b3196631b32e3e6dfab868c4dad98840c9d21ef636334e5387d248c989c7694f296f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexfileversion"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latexfileversion-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
