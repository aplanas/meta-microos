SUMMARY = "A user-friendly wrapper around \\enlargethispage"
DESCRIPTION = "This small package provides the command \\addlines for adding or \
removing space in the textblock of the page it's used on. E.g., \
adding an extra line of text to the page so that a section fits \
better on the next page. It will also add space to the facing \
page in a two-sided document."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn49326"

RPM_NAME = "texlive-addlines-2023.201.0.0.3svn49326-54.1.noarch.rpm"
RPM_HASH = "c4b613d4bb42c4dd033f1a48b5648bb8f236dd070bd192cf50aa1ce2868b83d4136c887778ea6da7f1b41bbc207434854ec1d8d38b66005be7dd831fce264f5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(addlines.sty) \
texlive-addlines"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(afterpage.sty) \
tex(changepage.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
