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

RPM_NAME = "texlive-easyfig-2023.201.1.2asvn64967-53.2.noarch.rpm"
RPM_HASH = "2b0eb5421c1237a0e8fd98cb0ae16cd42ec78fc216b42b2cd8ed89727be53a5227dcbe4095e047346474f02210011277779980b7a98357f75af0d51e3548d855"
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
