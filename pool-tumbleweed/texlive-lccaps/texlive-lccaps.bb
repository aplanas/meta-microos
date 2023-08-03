SUMMARY = "Lowercased (spaced) small capitals"
DESCRIPTION = "This little package serves the purpose of providing a uniform \
method to use lowercased small capitals and spaced lowercased \
small capitals. It relies on the iftex, textcase, and microtype \
packages and comes with four new user macros: \\textlcc, the \
main feature: lowercased small capitals; \\spacedcaps, a prefix \
to small capitals text commands to slightly increase their \
spacing; \\textslcc and \\textssc, which are shortcuts for \
\\spacedcaps\\textlcc and \\spacedcaps\\textsc (accordingly)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn46432"

RPM_NAME = "texlive-lccaps-2023.209.1.0svn46432-55.1.noarch.rpm"
RPM_HASH = "592fe11d48aa21bc517f37d8e7d0d336d908ed4ccadb3c65c7d1fd995bc9fe4f8d6657a23ba13843166d310ab587a7cc4f926bd9b0d1acf0f8b67a42ea72f3ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lccaps.sty \
texlive-lccaps"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-microtype.sty \
tex-textcase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
