SUMMARY = "Extension for the gb4e package"
DESCRIPTION = "This is an add-on for the gb4e package used in linguistics. It \
implements the \\Next, \\NNext, \\Last, and \\LLast commands from \
the linguex package or the \\nextx, \\anextx, \\lastx, \\blastx, \
and \\bblastx commands from the expex package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0svn56575"

RPM_NAME = "texlive-nnext-2023.209.0.0.0svn56575-55.1.noarch.rpm"
RPM_HASH = "6590eb469f939b59534fdd46b99a156de3f60646bc280312fa53fde275b42f4180de6a29fd65759bedb2026a0fb927177cc9845946eb2b8498a51a439a3ff56b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nnext.sty \
texlive-nnext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
