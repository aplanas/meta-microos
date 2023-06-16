SUMMARY = "Tidy \\listfiles with long file names"
DESCRIPTION = "The package equips LaTeX's \\listfiles command with an optional \
argument for the number of characters in the longest base \
filename. This way you get a neatly aligned file list even when \
it contains files whose base names have more than 8 characters. \
The package can be combined with the myfilist package as \
explained in the documentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn27889"

RPM_NAME = "texlive-longnamefilelist-2023.201.0.0.2svn27889-54.1.noarch.rpm"
RPM_HASH = "bc9510a11ad64b481d83ca75fb3d2df794bb511c69f955c56948c509958b1daacb9602704ce1fec58d8abf115154c33959f8445cce2fa775605e78f0fab2ba57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-longnamefilelist.sty \
texlive-longnamefilelist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-myfilist.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
