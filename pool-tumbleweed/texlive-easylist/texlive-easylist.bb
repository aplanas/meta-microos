SUMMARY = "Lists using a single active character"
DESCRIPTION = "This package allows you to create lists of numbered items (as \
in Wittgenstein's 'Tractatus') with a single active character \
as the only command. A variety of parameters are available to \
configure the appearance of the list; lists may be nested \
(effectively to unlimited depth)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn32661"

RPM_NAME = "texlive-easylist-2023.209.1.3svn32661-54.1.noarch.rpm"
RPM_HASH = "4161cbb7150616740c424a7c0b45cfb2d1b77475980d13930bf2406b64adb31dcbee9e11f4d26bc510fb0e01d16afc275ed2a225fc8d06de9933bc4ca88e457d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-easylist.sty \
texlive-easylist"

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
