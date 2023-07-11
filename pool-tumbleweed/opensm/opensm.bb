SUMMARY = "Infiniband Subnet Manager"
DESCRIPTION = "OpenSM provides an implementation for an InfiniBand Subnet Manager and \
Administration. Such a software entity is required to run for in order \
to initialize the InfiniBand hardware (at least one per each InfiniBand \
subnet)."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "3.3.24"

RPM_NAME = "opensm-3.3.24-3.8.aarch64.rpm"
RPM_HASH = "ade6fbb494ba8ce9c35a9514eefab5b0670cb28594f4e6398b208aee598d12036b6a7e8a61ac372ddf0df215db68ed3913aa99055f13ddcb818a427433d0660e"

RPROVIDES:${PN} += "config-opensm \
opensm"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopensm.so.9 \
libosmcomp.so.5 \
libosmvendor.so.5 \
logrotate \
systemd"

inherit rpm
