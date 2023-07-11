SUMMARY = "Graphical configuration frontend and launcher for FS-UAE"
DESCRIPTION = "FS-UAE Launcher is a graphical configuration program and launcher for FS-UAE."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.68"

RPM_NAME = "fs-uae-launcher-3.1.68-1.4.noarch.rpm"
RPM_HASH = "b46579c91338658fd2b5d726dfb6ca585d85fe60c4604b903c071356b84e05017a49c16e65fbcf3bc63ae13b57e60fccd333e82b1282f8a326c94816b17ffc6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fs-uae-launcher"

RDEPENDS:${PN} += "/usr/bin/python3 \
fs-uae \
python3-opengl \
python3-qt5 \
python3-requests"

inherit rpm
