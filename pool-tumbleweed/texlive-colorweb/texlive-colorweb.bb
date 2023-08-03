SUMMARY = "Extend the color package colour space"
DESCRIPTION = "The package makes the 216 'web-safe colours' available to the \
standard color package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn31490"

RPM_NAME = "texlive-colorweb-2023.209.1.3svn31490-54.1.noarch.rpm"
RPM_HASH = "3f149b250d9f473a2ab1d05f0da2d317e994ab1e90ec02a309d201c7a684fb0c52f097d75de5935ee9adb47d1e10a75a6d02ca02aa0e91986ca855b95d8346ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colorweb.sty \
texlive-colorweb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
