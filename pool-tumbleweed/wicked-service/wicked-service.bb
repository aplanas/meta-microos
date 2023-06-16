SUMMARY = "Network configuration infrastructure - systemd service"
DESCRIPTION = "Wicked is a network configuration infrastructure incorporating a number \
of existing frameworks into a unified architecture, providing a DBUS \
interface to network configuration. \
 \
This package provides the wicked systemd service files."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.72"

RPM_NAME = "wicked-service-0.6.72-2.3.aarch64.rpm"
RPM_HASH = "f3157d32b0cf0b636a456aa649650fb913fd3e0a88ae1228ecfa4b99454695bbeb153b3148558ffbc0bb384e59e5e0712459b95a9d571a28763f3bf751c54745"

RPROVIDES:${PN} += "/sbin/ifup \
config-wicked-service \
service-network \
sysvinit-network \
wicked-service"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
sysconfig \
wicked"

inherit rpm
