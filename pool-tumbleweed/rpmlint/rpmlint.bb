SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230727.0fd5122"

RPM_NAME = "rpmlint-2.4.0+git20230727.0fd5122-1.1.noarch.rpm"
RPM_HASH = "319329ff2653812eeefb4e2db796b15125a70b663f7ae8ab2e9b4e6b758e136269a5738e1d025e42f857477183bd53323ce0cdd9a36fdcf17a6f038335ad338a"
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
