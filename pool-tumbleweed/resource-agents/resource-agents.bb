SUMMARY = "HA Reusable Cluster Resource Scripts"
DESCRIPTION = "A set of scripts to interface with several services to operate in a \
High Availability environment for both Pacemaker and rgmanager \
service managers."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "4.12.0+git30.7fd7c8fa"

RPM_NAME = "resource-agents-4.12.0+git30.7fd7c8fa-1.2.aarch64.rpm"
RPM_HASH = "f7537caa58d73fb01f425a4fb00c21a4c267115f07cf9ae65badd8cf801bd57a2826b8c6f8b0a8f15abdb3c1210304e12761b0a51ead05741bbd31922618e5b9"

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
