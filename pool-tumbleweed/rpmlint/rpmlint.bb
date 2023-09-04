SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230818.5cdd21d0"

RPM_NAME = "rpmlint-2.4.0+git20230818.5cdd21d0-1.1.noarch.rpm"
RPM_HASH = "b0f38634bd0c90148d486de92c0eb33fb24215f7eadc4c5beb37eff6c07f72a15c03fcc08ffe719cc4d098dfdaf8f941d96ee62eb257c6c4735ac18fb991a081"
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
