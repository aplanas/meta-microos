SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230713.dfa31c7"

RPM_NAME = "rpmlint-2.4.0+git20230713.dfa31c7-1.1.noarch.rpm"
RPM_HASH = "b39bf4a6d23f354d8689a50f816cd2c14586ee387641208d8c617512fb46694fce78dd7de505ec09e5dccf5ee49cca92ee08dfc0474778c9732b51802fe941da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-rpmlint \
python3.11dist-rpmlint \
python3dist-rpmlint \
rpmlint"

RDEPENDS:${PN} += "/usr/bin/python3 \
appstream-glib \
bash \
binutils \
checkbashisms \
cpio \
dash \
desktop-file-utils \
file \
findutils \
myspell-en-US \
python-abi \
python3-pybeam \
python3-pyenchant \
python3-python-magic \
python3-pyxdg \
python3-rpm \
python3-tomli \
python3-tomli-w \
python3-zstandard \
rpm-build"

inherit rpm
