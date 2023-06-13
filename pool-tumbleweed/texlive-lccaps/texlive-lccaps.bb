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

PV = "2023.201.1.0svn46432"

RPM_NAME = "texlive-lccaps-2023.201.1.0svn46432-54.1.noarch.rpm"
RPM_HASH = "a91601f71031333819ecc6bfc66655407152f343d455e6345c7caffa57fb14d00857ec5c6c6097f014bfa3cb0f581a7b6fa0c48e98017f76b8406ba7ad389d01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lccaps.sty) \
texlive-lccaps"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(iftex.sty) \
tex(microtype.sty) \
tex(textcase.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
