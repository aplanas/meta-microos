SUMMARY = "Manual change markup"
DESCRIPTION = "The package allows the user to manually markup changes of text, \
such as additions, deletions, or replacements. Changed text is \
shown in a different color; deleted text is striked out. \
Additionally, text can be highlighted and/or commented. The \
package allows free definition of additional authors and their \
associated color. It also allows you to change the markup of \
changes, authors, highlights or comments. A Python script is \
provided for removing the changes."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2.1svn59950"

RPM_NAME = "texlive-changes-2023.201.4.2.1svn59950-52.1.noarch.rpm"
RPM_HASH = "fe48d64f82ca9181fc31a92915929d129ac390c4465525e1d8a3d5f17c1cb0c8b8b40c89614bef93fa1cea7f05e0e6e6fc580d3b98e27bd7e39af08a0ee16c2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-changes.sty \
texlive-changes"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-todonotes.sty \
tex-truncate.sty \
tex-ulem.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
