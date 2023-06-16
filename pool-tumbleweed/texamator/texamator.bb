SUMMARY = "Manage databases of exercises written in (La)TeX"
DESCRIPTION = "TeXamator is written using PyQt5. It is aimed at helping you making your \
exercise sheets. Basically, it browses a specified directory, looks for \
.tex files containing exercices and builds a tree with all your exercises. \
You can click on an element of the tree to have a preview of the exercise \
sheet and then add exercises to a list if you wish to. Then you can save \
your work to a .tex file or you can generate a pdf file."
LICENSE = "GPL-3.0-only"

PV = "3.0+git.20190226.91432e4"

RPM_NAME = "texamator-3.0+git.20190226.91432e4-1.19.noarch.rpm"
RPM_HASH = "21aef2c4f8ac3849a8998436e57daff5073fec39eaf623709d36b6802454b40e819fb76577c52822b0ad3db562ef47edabf1d4f12c6c76d6edc6306480ec426b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texamator"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-base \
python3-poppler-qt5 \
python3-qt5 \
texlive-latex"

inherit rpm
