SUMMARY = "Network configuration scripts for Amazon EC2"
DESCRIPTION = "This package contains scripts for automatically configuring network interfaces \
in Amazon EC2 with full support for hotplug."
LICENSE = "GPL-3.0-or-later"

PV = "1.7"

RPM_NAME = "cloud-netconfig-ec2-1.7-1.3.noarch.rpm"
RPM_HASH = "e476646dafcb5b8eabf27da7cd322334d37396e6ed540fdac777a4450321949b787a3d477db9862df674fe095588b241fed0c22c46505ce5a39bd1bcc3e361ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cloud-netconfig \
cloud-netconfig-ec2"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
sysconfig-netconfig \
systemd \
udev"

inherit rpm
