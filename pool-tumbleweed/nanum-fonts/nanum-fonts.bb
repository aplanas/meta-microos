SUMMARY = "Nanum Korean TrueType Fonts"
DESCRIPTION = "Collection of Nanum Korean TrueType fonts: NanumBrush, \
NanumGothic, NanumMyeongjo and NanumPen."
LICENSE = "OFL-1.1"

PV = "20110907"

RPM_NAME = "nanum-fonts-20110907-23.26.noarch.rpm"
RPM_HASH = "9d08e2b5903c1eda25cc4e787b44f977957c7076514d971b85937c5aeb018b91b79ed59c63e61825e26d6ff4b5eae613d33c6b2f0b82085b2d14e87fbc28a814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-ko \
nanum-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
