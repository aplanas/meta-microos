SUMMARY = "Disable kernel ir device handling in favor of lirc"
DESCRIPTION = "Udev rule which disables the kernel built-in handling of infrared devices \
(i. e., rc* ones) by making lirc the only used protocol."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "lirc-disable-kernel-rc-0.10.1-10.1.aarch64.rpm"
RPM_HASH = "e2cc369e7ac404b5b700744d57ccf7f77ac8e84fec91b09f69d5dc44c3d82d3a3b669c09fecad77503a88993674ae63aebe4f72e42096df550a240aca628b833"

RPROVIDES:${PN} += "lirc-disable-kernel-rc"

RDEPENDS:${PN} += "lirc-core"

inherit rpm
