SUMMARY = "Network configuration scripts for Microsoft Azure"
DESCRIPTION = "This package contains scripts for automatically configuring network interfaces \
in Microsoft Azure with full support for hotplug."
LICENSE = "GPL-3.0-or-later"

PV = "1.8"

RPM_NAME = "cloud-netconfig-azure-1.8-1.1.noarch.rpm"
RPM_HASH = "cb66bab924ce0b6075ff15023281c18a2aecdc284a46aeb866cf9977f38c595afa61d81bdaa15b8777471ebe0e8aba3936e472fce400c310e10a8414de9bd3fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cloud-netconfig \
cloud-netconfig-azure"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
sysconfig-netconfig \
udev"

inherit rpm
