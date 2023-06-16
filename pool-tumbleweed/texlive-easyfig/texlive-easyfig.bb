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

PV = "2023.201.1.2asvn64967"

RPM_NAME = "texlive-easyfig-2023.201.1.2asvn64967-53.1.noarch.rpm"
RPM_HASH = "351a7427cfebe04b388b9aa9dd19c130b8ea96854c3ab2a0ec5ab931d72d1330b8b93860273d4428ec171b779c3a0276ea31207ecd8432257ef1c8537109e050"
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
