SUMMARY = "Continuously update packages from devel:openQA"
DESCRIPTION = "Use this package to install and enable a systemd service for continuously \
upgrading the system if devel:openQA packages are stable and contain updates. It \
is complementary to auto-update which also reboots the system and does updates \
regardless of whether devel:openQA contains updates."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1690803816.e47aebd"

RPM_NAME = "openQA-continuous-update-4.6.1690803816.e47aebd-1.1.aarch64.rpm"
RPM_HASH = "aca38f3c3427116fdd2bb85a02ffa1febda3daa6550abbb58e89286b8ea35816378344c08147a89a3928bd00bfb278c9a5208c0907045c5ebbb6aee71285cfdd"

RPROVIDES:${PN} += "openQA-continuous-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
openQA-common"

inherit rpm
