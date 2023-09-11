SUMMARY = "Continuously update packages from devel:openQA"
DESCRIPTION = "Use this package to install and enable a systemd service for continuously \
upgrading the system if devel:openQA packages are stable and contain updates. It \
is complementary to auto-update which also reboots the system and does updates \
regardless of whether devel:openQA contains updates."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1693565748.f367431"

RPM_NAME = "openQA-continuous-update-4.6.1693565748.f367431-1.1.aarch64.rpm"
RPM_HASH = "bfc685376dc2032f84ca31ab874a2e65c2d64cdfc7735c9ab31c505dd4d2c118d8e3cf0733538269a7b249c26b7d96e246fbc4ed3959aa6896a3a0dfa87861e3"

RPROVIDES:${PN} += "openQA-continuous-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
openQA-common"

inherit rpm
