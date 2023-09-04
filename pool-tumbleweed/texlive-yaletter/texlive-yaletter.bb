SUMMARY = "Extremely flexible macros for letters, envelopes, and label sheets"
DESCRIPTION = "The yaletter class provides extremely configurable macros for \
typesetting letters in any conceivable style. It provides \
facilities for maintaining easily-accessible databases of \
letterheads and addresses for repeat use. It further provides \
easy macros for envelopes and for label sheets. Finally, it \
provides some nice defaults for a few of the more common styles \
and sizes."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn42830"

RPM_NAME = "texlive-yaletter-2023.209.1.1svn42830-53.2.noarch.rpm"
RPM_HASH = "b1b0c113235992e77cd6a1561738e029fd2fbde1e4d582fdecaf3a701baf70197eb8cfd92216c6caf08222bb04fe075d1c8b90b84df4caba891f05078ac461f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-yaletter.cls \
texlive-yaletter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-textpos.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
