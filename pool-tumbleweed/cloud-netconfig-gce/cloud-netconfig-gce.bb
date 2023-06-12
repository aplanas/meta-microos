SUMMARY = "Network configuration scripts for Google Compute Engine"
DESCRIPTION = "This package contains scripts for automatically configuring network interfaces \
in Google Compute Engine with full support for hotplug."
LICENSE = "GPL-3.0-or-later"

PV = "1.7"

RPM_NAME = "cloud-netconfig-gce-1.7-1.2.noarch.rpm"
RPM_HASH = "5a2dd293b4e68882689d841189d8186bf98db8f659690b81a913966fda56b18742fee32f375e9db60effa85061864a3969db272e11c79a7cb529af73661ba8fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cloud-netconfig \
cloud-netconfig-gce"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
curl \
sysconfig-netconfig \
systemd \
udev"

inherit rpm
