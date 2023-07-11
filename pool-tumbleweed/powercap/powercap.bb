SUMMARY = "Tools for the Linux Power Capping Framework"
DESCRIPTION = "This project provides the powercap library -- a generic C interface to the \
Linux power capping framework (sysfs interface). It includes an implementation \
for working with Intel Running Average Power Limit (RAPL). \
 \
It also provides the following applications: \
 \
powercap-info - view powercap control type hierarchies or zone/constraint-specific configurations \
powercap-set - set powercap control type zone/constraint-specific configurations"
LICENSE = "GPL-2.0-only"

PV = "0.6.0"

RPM_NAME = "powercap-0.6.0-1.4.aarch64.rpm"
RPM_HASH = "7533cce511bf087d9bfbb45876648c597d647cec4867ffd95e9baf684f9c6dea95b82709d42eec3ba222c24569994b0294f08ec33c7aa032e090ddc7d9f84c9c"

RPROVIDES:${PN} += "libpowercap.so.0 \
powercap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
