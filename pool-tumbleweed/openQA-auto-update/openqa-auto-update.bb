SUMMARY = "Automatically upgrade and reboot the system when required"
DESCRIPTION = "Use this package to install and enable a systemd service for nightly upgrading \
and rebooting the system if devel:openQA packages are stable."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689360748.edd4aa1"

RPM_NAME = "openQA-auto-update-4.6.1689360748.edd4aa1-1.1.aarch64.rpm"
RPM_HASH = "a8f29b7fb626a30e0fd9565f311a276937be944b3f8f4d1e0569e2ae014b2b0868fb02ae92c4e50ae8bcfeb0cd9cac40ad5b72e26e57d9c8bb2f3be84da48fa8"

RPROVIDES:${PN} += "openQA-auto-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
openQA-common \
rebootmgr"

inherit rpm
