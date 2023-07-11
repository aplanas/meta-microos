SUMMARY = "Grow a partition automatically"
DESCRIPTION = "This systemd generator implements the 'x-growpart.grow' mount options in /etc/fstab \
allowing to grow the referenced partition to its maximum size. \
It behaves like 'x-systemd.growfs' and is usually used in combination with that."
LICENSE = "GPL-3.0-only"

PV = "0.8"

RPM_NAME = "growpart-generator-0.8-3.6.noarch.rpm"
RPM_HASH = "e89bc67be5a01bf1f43a8f9a62eed4654d3eef9460a20d74c7a94a4a6c52be8e0973819581d40ce98a99f532bd76065e94566c81b81b8a8be0e6a1935ce26226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "growpart-generator"

RDEPENDS:${PN} += "/usr/bin/sh \
growpart \
systemd"

inherit rpm
