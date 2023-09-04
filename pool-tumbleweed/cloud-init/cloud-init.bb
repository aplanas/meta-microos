SUMMARY = "Cloud node initialization tool"
DESCRIPTION = "Cloud-init is an init script that initializes a cloud node (VM) \
according to the fetched configuration data from the admin node."
LICENSE = "GPL-3.0-only"

PV = "23.1.2"

RPM_NAME = "cloud-init-23.1.2-1.1.aarch64.rpm"
RPM_HASH = "94baaaf676b0dfff4931f066462ab313ce393d210b4ce6d96a99eef8ca75d6c9991f4fc9cdcc365b02eab817800978d1a20c0856017ddfddf26c22134085d711"

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
