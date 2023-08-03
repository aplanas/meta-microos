SUMMARY = "HiSilicon based arm64 systems"
DESCRIPTION = "Device Tree files for HiSilicon based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-hisilicon-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "f6d5cb3d603c891efd708b4e3a9a873b5f44db4de8e8d5a9d93a7b74210258be88ddc37c66b5c350a4e169d407051a34a54525e50de4d1f9ee48d2b9bd384b10"

RPROVIDES:${PN} += "dtb-hisilicon \
dtb-hisilicon64 \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
