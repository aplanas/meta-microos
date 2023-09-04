SUMMARY = "Graphics and text watermarks on selected pages"
DESCRIPTION = "The package extends the author's draftmark and the watermark \
packages. It is currently unmaintained and does not work with \
modern LaTeX releases."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.2dsvn61719"

RPM_NAME = "texlive-xwatermark-2023.209.1.5.2dsvn61719-53.2.noarch.rpm"
RPM_HASH = "738943f2355addcff83c95ecf49440ac8adca2c12b3079e6282d526f176259b9ed4b308a10949d685d6e2d0d06c1240a15320524dc38767b4e488ae6793c632e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xwatermark.sty \
texlive-xwatermark"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catoptions.sty \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
