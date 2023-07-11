SUMMARY = "Component for salt that enables controlling arbitrary devices"
DESCRIPTION = "Proxy minions are a developing Salt feature that enables controlling devices that, \
for whatever reason, cannot run a standard salt-minion. \
Examples include network gear that has an API but runs a proprietary OS, \
devices with limited CPU or memory, or devices that could run a minion, but for \
security reasons, will not."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-proxy-3006.0-1.4.aarch64.rpm"
RPM_HASH = "6b76e38c6ea40c80cc22a7870b70725b13094689250d4d5bffd25e05d509a98e92860f3e71b4c6e3851205541c64540e30ee8683b5651876acb61517e847a37d"

RPROVIDES:${PN} += "salt-proxy"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/sh \
/usr/bin/touch \
fillup \
salt \
systemd"

inherit rpm
