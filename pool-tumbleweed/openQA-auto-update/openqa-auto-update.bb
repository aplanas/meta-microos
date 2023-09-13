SUMMARY = "Automatically upgrade and reboot the system when required"
DESCRIPTION = "Use this package to install and enable a systemd service for nightly upgrading \
and rebooting the system if devel:openQA packages are stable."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1694101660.598baea"

RPM_NAME = "openQA-auto-update-4.6.1694101660.598baea-1.1.aarch64.rpm"
RPM_HASH = "6746b7fd0b61cdc91468fdde40529427e0608a78aa609960378731bb541809976af9cf9504e7b7b407be350e34ef371ea012acf48df219e8ef4c02528c29b80f"

RPROVIDES:${PN} += "openQA-auto-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
openQA-common \
rebootmgr"

inherit rpm
