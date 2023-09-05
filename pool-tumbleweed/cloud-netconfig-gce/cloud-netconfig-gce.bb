SUMMARY = "Network configuration scripts for Google Compute Engine"
DESCRIPTION = "This package contains scripts for automatically configuring network interfaces \
in Google Compute Engine with full support for hotplug."
LICENSE = "GPL-3.0-or-later"

PV = "1.8"

RPM_NAME = "cloud-netconfig-gce-1.8-1.1.noarch.rpm"
RPM_HASH = "f2a7d0eed829b9982a61639dedd2bf88d93e5fdf93d2d329e16c477d42095eeb4c5b987b275b2a6f9d36fef425b1e5320530db6fb6fdac55cf89fd86cb0ee247"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cloud-netconfig \
cloud-netconfig-gce"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
sysconfig-netconfig \
udev"

inherit rpm
