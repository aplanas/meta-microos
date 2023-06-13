SUMMARY = "Component for salt that enables controlling arbitrary devices"
DESCRIPTION = "Proxy minions are a developing Salt feature that enables controlling devices that, \
for whatever reason, cannot run a standard salt-minion. \
Examples include network gear that has an API but runs a proprietary OS, \
devices with limited CPU or memory, or devices that could run a minion, but for \
security reasons, will not."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-proxy-3006.0-1.1.aarch64.rpm"
RPM_HASH = "82ceafa0fef55b4573e0ebf350b8b9aa4bccd60a641b39d2d09e4e3d928319a6ed77f5a62eec58f9aa7a416f2b8dc4b5d94fb2ceb2df933d1d6c32c731a5a941"

RPROVIDES:${PN} += "salt-proxy \
salt-proxy(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/touch \
fillup \
salt \
systemd"

inherit rpm
