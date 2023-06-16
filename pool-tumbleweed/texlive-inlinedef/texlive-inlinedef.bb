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

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-inlinedef-2023.201.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "84771be1d4ed75a6d6d80be6149a2cf5a1fec6fe15d1d81dc5117c02f2921190cefc1fb9a322a0f5d4409a2cd63a4f75f896fe6dff6f5d6f9ec7bd1849bad64b"
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
