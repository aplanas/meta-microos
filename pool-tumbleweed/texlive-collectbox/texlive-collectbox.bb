SUMMARY = "Collect and process macro arguments as boxes"
DESCRIPTION = "The package provides macros to collect and process a macro \
argument (i.e., something which looks like a macro argument) as \
a horizontal box rather than as a real macro argument. The \
'arguments' are stored as if they had been saved by \\savebox or \
by the lrbox environment. Grouping tokens \\bgroup and \\egroup \
may be used, which allows the user to have the beginning and \
end of a group in different macro invocations, or to place them \
in the begin and end code of an environment. Arguments may \
contain verbatim material or other special use of characters. \
The macros were designed for use within other macros."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4csvn64967"

RPM_NAME = "texlive-collectbox-2023.209.0.0.4csvn64967-54.1.noarch.rpm"
RPM_HASH = "662ec706b49632dd779556764d51a67a9a161341e04129cf6b39ef3d8131ab9705ca7c95e1c40650aba37959d6332c9b0fdaece502fe6d034df1f3e94664985c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-collectbox.sty \
texlive-collectbox"

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
