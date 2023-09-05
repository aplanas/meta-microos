SUMMARY = "Network configuration scripts for Amazon EC2"
DESCRIPTION = "This package contains scripts for automatically configuring network interfaces \
in Amazon EC2 with full support for hotplug."
LICENSE = "GPL-3.0-or-later"

PV = "1.8"

RPM_NAME = "cloud-netconfig-ec2-1.8-1.1.noarch.rpm"
RPM_HASH = "196513a2329a8c6c804914cfc2827ca38b19f9ee1f2079f3f038c57e38f33ddf45a3e86ee1a5c34aeaf121fd90c221c60dfd831f3b8d9ac255264ed0f9207e0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cloud-netconfig \
cloud-netconfig-ec2"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
sysconfig-netconfig \
udev"

inherit rpm
