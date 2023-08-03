SUMMARY = "CJK language support"
DESCRIPTION = "CJK is a macro package for LaTeX, providing simultaneous \
support for various Asian scripts in many encodings (including \
Unicode): Chinese (both traditional and simplified), Japanese, \
Korean and Thai. A special add-on feature is an interface to \
the Emacs editor (cjk-enc.el) which gives simultaneous, \
easy-to-use support to a bunch of other scripts in addition to \
the above -- Cyrillic, Greek, Latin-based scripts, Russian and \
Vietnamese are supported."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.4.8.5svn60833"

RPM_NAME = "texlive-cjkutils-2023.209.4.8.5svn60833-54.1.noarch.rpm"
RPM_HASH = "4e77327633d0b29a3d2fc447af07a1c0611920aa9c25a4fbb27810c3af5cac75ba1414cb8c6390491c3cc8f9abec93dabbbf1301f0148f9f86efb9b672a5f51b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-b5ka12.cfg \
tex-b5kr12.cfg \
tex-b5so12.cfg \
tex-c1so12.cfg \
tex-c2so12.cfg \
tex-c3so12.cfg \
tex-c4so12.cfg \
tex-c5so12.cfg \
tex-c6so12.cfg \
tex-c7so12.cfg \
tex-csso12.cfg \
tex-gsfs14.cfg \
tex-j2so12.cfg \
tex-jsso12.cfg \
tex-ksso17.cfg \
texlive-cjkutils"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-cjkutils-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
