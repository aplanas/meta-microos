SUMMARY = "Automatically upgrade and reboot the system when required"
DESCRIPTION = "Use this package to install and enable a systemd service for nightly upgrading \
and rebooting the system if devel:openQA packages are stable."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689265095.7be7504"

RPM_NAME = "openQA-auto-update-4.6.1689265095.7be7504-1.1.aarch64.rpm"
RPM_HASH = "ce4f9965556a8fa76c33736627f894059e9349eaf1d70fefdb651a379219fc8d7d3437cc82fe903b7fdfee5e3ef25cf0f66d7b2b3e81b400d6a6391c5aec8ae9"

RPROVIDES:${PN} += "openQA-auto-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
openQA-common \
rebootmgr"

inherit rpm
