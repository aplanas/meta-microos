SUMMARY = "Cloud node initialization tool"
DESCRIPTION = "Cloud-init is an init script that initializes a cloud node (VM) \
according to the fetched configuration data from the admin node."
LICENSE = "GPL-3.0"

PV = "23.1"

RPM_NAME = "cloud-init-23.1-2.1.aarch64.rpm"
RPM_HASH = "d75c85aec0d6f158f6326b1b54b53b691856c6b1d27854b4ba906651e9c5d9f3774c41a374292d89e2c8645ddb55d6d87a2523eae8284964a9a172bdf93b837d"

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
python3-serial \
python3-setuptools \
python3-xml \
sudo \
systemd \
util-linux \
wget"

inherit rpm
