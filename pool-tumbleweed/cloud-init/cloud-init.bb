SUMMARY = "Cloud node initialization tool"
DESCRIPTION = "Cloud-init is an init script that initializes a cloud node (VM) \
according to the fetched configuration data from the admin node."
LICENSE = "GPL-3.0"

PV = "23.1"

RPM_NAME = "cloud-init-23.1-1.4.aarch64.rpm"
RPM_HASH = "e3b2df18e65a30a3d172621b708a3e5f5a5320aca62aa4877b787fda948acf81da7727cff1ad3d54bf1cbf92f1524fc71914db43a94c7d8efc019305c6a17dec"

RPROVIDES:${PN} += "cloud-init \
config-cloud-init \
python3.11dist-cloud-init \
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
