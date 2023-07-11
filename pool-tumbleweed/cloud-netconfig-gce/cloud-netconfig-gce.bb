SUMMARY = "Network configuration scripts for Google Compute Engine"
DESCRIPTION = "This package contains scripts for automatically configuring network interfaces \
in Google Compute Engine with full support for hotplug."
LICENSE = "GPL-3.0-or-later"

PV = "1.7"

RPM_NAME = "cloud-netconfig-gce-1.7-1.3.noarch.rpm"
RPM_HASH = "8b6d38b2661239d278c5d7ee8605f1f27dce9043e57562c791b4bc5416bfcd89eddf19c282e0ff9662057f46c170f3366f45a27e4ba0d2b18c2859bc52774a3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cloud-netconfig \
cloud-netconfig-gce"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
sysconfig-netconfig \
systemd \
udev"

inherit rpm
