SUMMARY = "SSH brute force attack protector"
DESCRIPTION = "Sshguard protects networked hosts from brute force attacks \
against ssh servers. It detects such attacks and blocks the \
attacker's address with a firewall rule."
LICENSE = "ISC"

PV = "2.4.2"

RPM_NAME = "sshguard-2.4.2-6.4.aarch64.rpm"
RPM_HASH = "8f68369579108a6ef180e08ed15a1b285b8548e4c9cd05f64a53414f613beee977cf0f78b4ac83af1695da4f031508241cb21bc7f74f92faa6fbd5179f0679b7"

RPROVIDES:${PN} += "config-sshguard \
sshguard"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
openssh \
systemd"

inherit rpm
