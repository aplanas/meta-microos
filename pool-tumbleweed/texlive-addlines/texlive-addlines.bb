SUMMARY = "A user-friendly wrapper around \\enlargethispage"
DESCRIPTION = "This small package provides the command \\addlines for adding or \
removing space in the textblock of the page it's used on. E.g., \
adding an extra line of text to the page so that a section fits \
better on the next page. It will also add space to the facing \
page in a two-sided document."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn49326"

RPM_NAME = "texlive-addlines-2023.209.0.0.3svn49326-55.1.noarch.rpm"
RPM_HASH = "ad2c122fdc041d91db794d9d1a9395922250239c8ea6b1532e99745267f61a79f2717a950d68a24e7fee9c80fbae651bcdddf0a6489d8ef986cd570ff0ba9b9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-addlines.sty \
texlive-addlines"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-changepage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
