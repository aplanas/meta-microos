SUMMARY = "Linux Trace Toolkit Next Generation userspace tools"
DESCRIPTION = "This package provides the userspace tools for controlling the LTTng \
subsystem from userspace."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.13.9"

RPM_NAME = "lttng-tools-devel-2.13.9-1.3.aarch64.rpm"
RPM_HASH = "8c3cde4d2db949203a8cd9e74c766bd2f30f08a752afee5609f3db88c77ca6f7182520b740cb58cf11d16b8e11848f2985720d2b5b27b63a98416d410a1ae7c6"

RPROVIDES:${PN} += "lttng-tools-devel \
lttng-tools-devel(aarch-64) \
pkgconfig(lttng-ctl)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblttng-ctl0 \
pkgconfig(liburcu) \
pkgconfig(liburcu-cds)"

inherit rpm
