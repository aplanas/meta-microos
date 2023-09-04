SUMMARY = "Simplifying the use of common figures"
DESCRIPTION = "The package provides the command \\Figure[<key=value>...]{<image \
filename>} to simplify the business of including an image as \
figure in the most common form (centred and with caption and \
label). Caption and label are set using the caption and label \
keys; the label fig:<image filename> is used if none is given. \
If the here key is given, the figure is not 'floated', and the \
user is responsible for placement. The package uses the \
author's package adjustbox to centre an image and to simplify \
further modifications. As adjustbox now provides keys to turn \
images or other material into floats or non-floats, including \
captions, easyfig has become quite redundant."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn64967"

RPM_NAME = "texlive-easyfig-2023.209.1.2asvn64967-54.2.noarch.rpm"
RPM_HASH = "e5b05375476b78b4fcdc13ae5788c911a6a76d7db934dc915825c92728c2e761261409553bb86b2ebc3bf0cfb1ecdeaa895b538ff9de5f706173b4d821b0fd90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-easyfig.sty \
texlive-easyfig"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-ifetex.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
