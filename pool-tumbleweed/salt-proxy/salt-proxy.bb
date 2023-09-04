SUMMARY = "Component for salt that enables controlling arbitrary devices"
DESCRIPTION = "Proxy minions are a developing Salt feature that enables controlling devices that, \
for whatever reason, cannot run a standard salt-minion. \
Examples include network gear that has an API but runs a proprietary OS, \
devices with limited CPU or memory, or devices that could run a minion, but for \
security reasons, will not."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-proxy-3006.0-2.1.aarch64.rpm"
RPM_HASH = "70229eb6cb77c43c73a1fe5ecb1dca2fd1d97066cd2205cac6644c508c33d82cd7498a908326ef57b13b9f7ae14c60648b46f68a32cf281a8fc451a96677a77b"

RPROVIDES:${PN} += "salt-proxy"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/sh \
/usr/bin/touch \
fillup \
salt \
systemd"

inherit rpm
