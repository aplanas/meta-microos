SUMMARY = "Extremely flexible macros for letters, envelopes, and label sheets"
DESCRIPTION = "The yaletter class provides extremely configurable macros for \
typesetting letters in any conceivable style. It provides \
facilities for maintaining easily-accessible databases of \
letterheads and addresses for repeat use. It further provides \
easy macros for envelopes and for label sheets. Finally, it \
provides some nice defaults for a few of the more common styles \
and sizes."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn42830"

RPM_NAME = "texlive-yaletter-2023.201.1.1svn42830-52.2.noarch.rpm"
RPM_HASH = "d559a204d513c0bfba7f575aa964704b89ccc543cf280204e6a8f01b0e2fa212bd1ed5c491c5baf6f2510d99bbb305f19d44cfe73bcedcc7cdaca2aa9dffde0b"
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
