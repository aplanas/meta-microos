SUMMARY = "Continuously update packages from devel:openQA"
DESCRIPTION = "Use this package to install and enable a systemd service for continuously \
upgrading the system if devel:openQA packages are stable and contain updates. It \
is complementary to auto-update which also reboots the system and does updates \
regardless of whether devel:openQA contains updates."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1692951551.c933949"

RPM_NAME = "openQA-continuous-update-4.6.1692951551.c933949-1.1.aarch64.rpm"
RPM_HASH = "4e5b22788236096f3b7ca844599c7e5745e6a4bba387fb8254a94267cd7e7c5603b91b52a449184b2994c651c6daf831adac16d6dbca9645a416793ea74d28ab"

RPROVIDES:${PN} += "openQA-continuous-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
openQA-common"

inherit rpm
