SUMMARY = "Japanese gothic-typeface fonts designed by Motoya"
DESCRIPTION = "This package provides a font family named 'MotoyaLCedar W3 mono'. \
It was provided to Android platform by Motoya."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "motoya-lcedar-fonts-1.0.0-11.17.noarch.rpm"
RPM_HASH = "644af3ac690be9342cfa6bbe49e20139596083711266eef8e628ecd16d71912ac07c67054d09cae192e81d946c75e597ce60084e3eff7da3ab2a269cf9a022d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "motoya-lcedar-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
