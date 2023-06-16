SUMMARY = "Cloud node initialization tool"
DESCRIPTION = "Cloud-init is an init script that initializes a cloud node (VM) \
according to the fetched configuration data from the admin node."
LICENSE = "GPL-3.0"

PV = "23.1"

RPM_NAME = "cloud-init-23.1-1.3.aarch64.rpm"
RPM_HASH = "9d02c8cd2f1f3e114bbbd9df43a409693c0d23cd131fea361c7498449cfcdf28dc0ac447c3f2dd76d8e6e55699bfb6bd2b3a6cd381ebbf34e895ed9546181cd0"

RPROVIDES:${PN} += "cloud-init \
config-cloud-init \
python3.10dist-cloud-init \
python3dist-cloud-init"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
bash \
cloud-init-config \
dhcp-client \
e2fsprogs \
file \
growpart \
net-tools \
openssh \
python-abi \
python3-Jinja2 \
python3-PyYAML \
python3-configobj \
python3-jsonpatch \
python3-jsonschema \
python3-netifaces \
python3-oauthlib \
python3-pyserial \
python3-requests \
python3-responses \
python3-serial \
python3-setuptools \
python3-xml \
sudo \
systemd \
util-linux \
wget"

inherit rpm
