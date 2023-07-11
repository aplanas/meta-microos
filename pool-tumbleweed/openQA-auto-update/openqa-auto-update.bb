SUMMARY = "Automatically upgrade and reboot the system when required"
DESCRIPTION = "Use this package to install and enable a systemd service for nightly upgrading \
and rebooting the system if devel:openQA packages are stable."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1688565452.efc15ea"

RPM_NAME = "openQA-auto-update-4.6.1688565452.efc15ea-1.1.aarch64.rpm"
RPM_HASH = "2168794a513f02ce21cd2533099df31e6c0d5fbc52f2171d823b3ab601557e9fc22d82d899f89ef39cc63751f1155882b04ed1784d631ae3fee3693ad4f26679"

RPROVIDES:${PN} += "openQA-auto-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
openQA-common \
rebootmgr"

inherit rpm
