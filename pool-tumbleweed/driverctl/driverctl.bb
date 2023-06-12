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

RPM_NAME = "driverctl-0.111-2.1.noarch.rpm"
RPM_HASH = "f9677e7123e80ec568b1d3301667759e4aebbd15008d419aee2530254960b23b0128f2a00ee65c2a10a7a0f29f7c4614be05b2bae63470a15f1565dbad41435c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "driverctl"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
coreutils \
udev"

inherit rpm
