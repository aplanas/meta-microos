SUMMARY = "Device Mapper Tools"
DESCRIPTION = "Programs and man pages for configuring and using the device mapper."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16_1.02.185"

RPM_NAME = "device-mapper-2.03.16_1.02.185-8.1.aarch64.rpm"
RPM_HASH = "65e7375538fb477464b22aca4707016b6a53723f93ef7632fa33ca0574edcd6b6b38afdade106e9cec6600cf1a636249eef68b6885eb1eb3439fb28b4fc1af3d"

RPROVIDES:${PN} += "device-mapper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdevmapper-event.so.1.03 \
libdevmapper.so.1.03 \
thin-provisioning-tools"

inherit rpm
