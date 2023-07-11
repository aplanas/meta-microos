SUMMARY = "Linux Trace Toolkit Next Generation userspace tools"
DESCRIPTION = "This package provides the userspace tools for controlling the LTTng \
subsystem from userspace."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.13.9"

RPM_NAME = "lttng-tools-devel-2.13.9-1.5.aarch64.rpm"
RPM_HASH = "d36fd8e69917f2e2bacec4827bad78852ddbfe1db7dbf38591a9a674448a3db57a79e932ec037ac5d14fee78e28f85f29c93391eced65fbb420f6bfc94dda580"

RPROVIDES:${PN} += "lttng-tools-devel \
pkgconfig-lttng-ctl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblttng-ctl0 \
pkgconfig-liburcu \
pkgconfig-liburcu-cds"

inherit rpm
