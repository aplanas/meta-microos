SUMMARY = "Continuously update packages from devel:openQA"
DESCRIPTION = "Use this package to install and enable a systemd service for continuously \
upgrading the system if devel:openQA packages are stable and contain updates. It \
is complementary to auto-update which also reboots the system and does updates \
regardless of whether devel:openQA contains updates."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1694101660.598baea"

RPM_NAME = "openQA-continuous-update-4.6.1694101660.598baea-1.1.aarch64.rpm"
RPM_HASH = "df2a999eaa07eabe0ba1f6352cd4a8f8197320599529fd593becbec33cd35934c191b17b592179ddd38a96146cf8e8c510f26336029727f4592d0d37c516c1f0"

RPROVIDES:${PN} += "openQA-continuous-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
openQA-common"

inherit rpm
