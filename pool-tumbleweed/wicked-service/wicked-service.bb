SUMMARY = "Network configuration infrastructure - systemd service"
DESCRIPTION = "Wicked is a network configuration infrastructure incorporating a number \
of existing frameworks into a unified architecture, providing a DBUS \
interface to network configuration. \
 \
This package provides the wicked systemd service files."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.73"

RPM_NAME = "wicked-service-0.6.73-2.1.aarch64.rpm"
RPM_HASH = "f04183f005048e6f633fc5ec60fc0d3e9b26be4fb09c25ab94b09be853320fffba8635d129bb807e7fa66efc53542af3cfdaf845fac3c63ef0c2a579026c7f10"

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
