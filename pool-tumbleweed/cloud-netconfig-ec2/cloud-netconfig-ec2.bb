SUMMARY = "Network configuration scripts for Amazon EC2"
DESCRIPTION = "This package contains scripts for automatically configuring network interfaces \
in Amazon EC2 with full support for hotplug."
LICENSE = "GPL-3.0-or-later"

PV = "1.7"

RPM_NAME = "cloud-netconfig-ec2-1.7-1.2.noarch.rpm"
RPM_HASH = "df0d708d14c04e150f8c4ffd0815d646fc97d57a2ea68497515538da8116392c9d241fff2fb2e5dcfacb918bf5c08e2fbdaf936d28ba97da90e2aa0963533dde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cloud-netconfig \
cloud-netconfig-ec2"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
curl \
sysconfig-netconfig \
systemd \
udev"

inherit rpm
