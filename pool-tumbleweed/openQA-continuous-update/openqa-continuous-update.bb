SUMMARY = "Continuously update packages from devel:openQA"
DESCRIPTION = "Use this package to install and enable a systemd service for continuously \
upgrading the system if devel:openQA packages are stable and contain updates. It \
is complementary to auto-update which also reboots the system and does updates \
regardless of whether devel:openQA contains updates."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689265095.7be7504"

RPM_NAME = "openQA-continuous-update-4.6.1689265095.7be7504-1.1.aarch64.rpm"
RPM_HASH = "17649d1b0122e99dbeccd878e24fbb730a7ce885e55887038624b1fa7a798302a9e278b687a2810cfd795b3bec9121c9046b42b23f3dc9c6b0e07f94116f262b"

RPROVIDES:${PN} += "openQA-continuous-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
openQA-common"

inherit rpm
