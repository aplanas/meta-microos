SUMMARY = "Format menu sequences, paths and keystrokes from lists"
DESCRIPTION = "This package is designed to format menu sequences, paths and \
keyboard shortcuts automatically. There are several predefined \
styles and one can define one's own styles in a flexible way."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6.2svn64314"

RPM_NAME = "texlive-menukeys-2023.209.1.6.2svn64314-55.1.noarch.rpm"
RPM_HASH = "ec1510719fa0cead60f684d85e8f71cfcf2c7944d1d138eba8e26f1e0c7043fa0feba43af96da4c895e61d7c0446c887af79b7d63c9a1c0cb206f1fa077de239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-menukeys-2020-12-19.sty \
tex-menukeys.sty \
texlive-menukeys"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-relsize.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
