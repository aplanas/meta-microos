SUMMARY = "Disable kernel ir device handling in favor of lirc"
DESCRIPTION = "Udev rule which disables the kernel built-in handling of infrared devices \
(i. e., rc* ones) by making lirc the only used protocol."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "lirc-disable-kernel-rc-0.10.1-10.2.aarch64.rpm"
RPM_HASH = "7a0db20b26eb2c061408b6fde58c0713f85aa28f7fb99125a2911b3b24c4532e262dfd58847e5a8c2012de31b6045f6c10aa604f1492fb42292b288dad6149be"

RPROVIDES:${PN} += "lirc-disable-kernel-rc"

RDEPENDS:${PN} += "lirc-core"

inherit rpm
