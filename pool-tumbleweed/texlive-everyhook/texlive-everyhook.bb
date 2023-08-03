SUMMARY = "Hooks for standard TeX token lists"
DESCRIPTION = "The package takes control of the six TeX token registers \
\\everypar, \\everymath, \\everydisplay, \\everyhbox, \\everyvbox \
and \\everycr. Real hooks for each of the registers may be \
installed using a stack like interface. For backwards \
compatibility, each of the \\everyX token lists can be set \
without interfering with the hooks."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn35675"

RPM_NAME = "texlive-everyhook-2023.209.1.2svn35675-53.1.noarch.rpm"
RPM_HASH = "a8552e16658ceb60e1c19cd4955d1b12b62081a6afaaa1c19749da2fe6967676e5edb6147fcf6e0c329a9d33a9bfed82b21ec43faef5b34a1a7e048767ead88b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-everyhook.sty \
texlive-everyhook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-svn-prov.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
