SUMMARY = "Avocado Virt Test Plugin"
DESCRIPTION = "Avocado Virt Test is a plugin that executes virt-tests with all the avocado \
features, such as HTML report and Xunit output, among others."
LICENSE = "GPL-2.0-only"

PV = "88.0"

RPM_NAME = "python3-avocado-plugins-vt-88.0-1.15.noarch.rpm"
RPM_HASH = "88ff9acf09ec5507ae46e4cb41a2e3877b75754e188fcc3d5f78adbcb0a68651ec0bc2d3717145b604d9ffc7fd4c4b190ac09330317ed285557a8635a5edae31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python3-avocado-plugins-vt \
python3-avocado-plugins-vt \
python3.11dist-avocado-framework-plugin-vt \
python3dist-avocado-framework-plugin-vt"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
attr \
bridge-utils \
gcc \
git-core \
glibc-devel \
iproute \
iputils \
make \
netcat-openbsd \
openvswitch \
python-abi \
python3-aexpect \
python3-avocado \
python3-dbm \
python3-devel \
python3-netaddr \
python3-netifaces \
python3-simplejson \
python3-six \
qemu-kvm \
systemtap \
tcpdump \
xz"

inherit rpm
