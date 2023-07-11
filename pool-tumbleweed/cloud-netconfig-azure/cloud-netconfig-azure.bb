SUMMARY = "Network configuration scripts for Microsoft Azure"
DESCRIPTION = "This package contains scripts for automatically configuring network interfaces \
in Microsoft Azure with full support for hotplug."
LICENSE = "GPL-3.0-or-later"

PV = "1.7"

RPM_NAME = "cloud-netconfig-azure-1.7-1.3.noarch.rpm"
RPM_HASH = "28421fda86ba78526f363f0a82e8b2ab2ae56be5fba01b57038ed9264f1e52583b01d4aec1c3838f60882299d3f230a7e0d2ebf1517ce377e8c095ee9a81dd97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cloud-netconfig \
cloud-netconfig-azure"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
sysconfig-netconfig \
systemd \
udev"

inherit rpm
