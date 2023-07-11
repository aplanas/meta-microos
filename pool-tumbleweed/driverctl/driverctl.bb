SUMMARY = "Device driver control utility"
DESCRIPTION = "driverctl is a tool for manipulating and inspecting the system \
device driver choices. \
 \
Devices are normally assigned to their sole designated kernel driver \
by default. However in some situations it may be desireable to \
override that default, for example to try an older driver to \
work around a regression in a driver or to try an experimental alternative \
driver. Another common use-case is pass-through drivers and driver \
stubs to allow userspace to drive the device, such as in case of \
virtualization. \
 \
driverctl integrates with udev to support overriding \
driver selection for both cold- and hotplugged devices from the \
moment of discovery, but can also change already assigned drivers, \
assuming they are not in use by the system. The driver overrides \
created by driverctl are persistent across system reboots \
by default."
LICENSE = "LGPL-2.0-only"

PV = "0.111"

RPM_NAME = "driverctl-0.111-2.2.noarch.rpm"
RPM_HASH = "c1089efa55ca3a7e9004d47b4c03d6e098bfe3f1559b2f94ba6fbf2b105ee2dac1d0616168875c6ad3c61b977b06a6fed0324add6ea233052ecde970a868e21e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "driverctl"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
udev"

inherit rpm
