SUMMARY = "Adjust behaviour of the ends of footnotes"
DESCRIPTION = "The LaTeX internal command \\@finalstrut is used automatically \
used at the end of footnote texts to insert a strut to avoid \
mis-spacing of multiple footnotes. Unfortunately the command \
can cause a blank line at the end of a footnote. The package \
provides a solution to this problem."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn21719"

RPM_NAME = "texlive-finstrut-2023.201.0.0.5svn21719-52.1.noarch.rpm"
RPM_HASH = "437307db6bef55151f6706619178efcb28f9cde269f4f1eb67bce85db7d1e83a2c813305dd59b11dcb0cf4ae7dbb80a8204388f189118e68c7c8dd3a89449149"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-finstrut.sty \
texlive-finstrut"

RDEPENDS:${PN} += "/bin/sh \
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
