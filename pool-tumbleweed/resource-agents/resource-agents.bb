SUMMARY = "HA Reusable Cluster Resource Scripts"
DESCRIPTION = "A set of scripts to interface with several services to operate in a \
High Availability environment for both Pacemaker and rgmanager \
service managers."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "4.12.0+git50.5c26404e"

RPM_NAME = "resource-agents-4.12.0+git50.5c26404e-1.1.aarch64.rpm"
RPM_HASH = "9a1e20b242e4f5895cbeb766d3c075d48506b6e22d7f8588ccec3de76d8ced045690c866f64cbabd199b163e52490b541ea5ea304d52589656d0978bfa98f930"

RPROVIDES:${PN} += "aws-vpc-move-ip \
config-resource-agents \
heartbeat-resources \
pkgconfig-resource-agents \
resource-agents \
resource-agents-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/logger \
/usr/bin/pkg-config \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libplumb.so.2"

inherit rpm
