SUMMARY = "Network configuration scripts for Microsoft Azure"
DESCRIPTION = "This package contains scripts for automatically configuring network interfaces \
in Microsoft Azure with full support for hotplug."
LICENSE = "GPL-3.0-or-later"

PV = "1.7"

RPM_NAME = "cloud-netconfig-azure-1.7-1.2.noarch.rpm"
RPM_HASH = "a67a0b283e46db3b6802f8fc46c2af20d170aad62dcfb2be3bfdabfaf8a15e9d48f3132245aef6cee4e5606a15f9a1975c089227f097428639861ac371d6ba20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cloud-netconfig \
cloud-netconfig-azure"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
curl \
sysconfig-netconfig \
systemd \
udev"

inherit rpm
