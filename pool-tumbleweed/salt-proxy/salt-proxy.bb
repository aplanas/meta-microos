SUMMARY = "Component for salt that enables controlling arbitrary devices"
DESCRIPTION = "Proxy minions are a developing Salt feature that enables controlling devices that, \
for whatever reason, cannot run a standard salt-minion. \
Examples include network gear that has an API but runs a proprietary OS, \
devices with limited CPU or memory, or devices that could run a minion, but for \
security reasons, will not."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-proxy-3006.0-4.1.aarch64.rpm"
RPM_HASH = "04b6ab11681bb38aa7300fe8fe721b85874ab2e1c92b4c72a9dc7a97f06585f8b5a28bb826c2d8e49e1a262f4df47cdeb0e3eda690dc52ffc1db534e45ae4a76"

RPROVIDES:${PN} += "salt-proxy"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/sh \
/usr/bin/touch \
fillup \
salt \
systemd"

inherit rpm
