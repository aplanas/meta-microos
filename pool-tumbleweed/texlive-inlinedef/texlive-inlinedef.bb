SUMMARY = "Inline expansions within definitions"
DESCRIPTION = "The package provides a macro \\Inline that precedes a \\def or \
\\gdef. Within the definition text of an inlined definition, \
keywords such as \\Expand may be used to selectively inline \
certain expansions at definition-time. This eases the process \
of redefining macros in terms of the original definition, as \
well as definitions in which the token that must be expanded is \
deep within, where \\expandafter would be difficult and \\edef is \
not suitable. Another application is as an easier version of \
\\aftergroup, by defining a macro in terms of expanded local \
variables, then ending the group with \
\\expandafter\\endgroup\\macro."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn15878"

RPM_NAME = "texlive-inlinedef-2023.208.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "6389f879ce0c1eba8afa684c770552e4318b9faea8c959f8146954c624c7bc012fda135620c2d2d334f6af247ed661abda17e7c574aeb09da71f39754abcc680"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-inlinedef.sty \
texlive-inlinedef"

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
