SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230602.89901a92"

RPM_NAME = "rpmlint-2.4.0+git20230602.89901a92-1.2.noarch.rpm"
RPM_HASH = "ca4abf9104135044d3ea7be17669c807882297c0dd3573c841158c36f4fc84838db70511d51b360dcc317ba7f0390634b5257522d62a0f6197d22e54e8435a21"
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
