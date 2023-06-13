SUMMARY = "Infiniband Subnet Manager"
DESCRIPTION = "OpenSM provides an implementation for an InfiniBand Subnet Manager and \
Administration. Such a software entity is required to run for in order \
to initialize the InfiniBand hardware (at least one per each InfiniBand \
subnet)."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "3.3.24"

RPM_NAME = "opensm-3.3.24-3.7.aarch64.rpm"
RPM_HASH = "0903de6e5a866f4a64767e2c99b7639565893239feb05825b9497de9819b04258bb48ebd3e1761d124812d3cb293a4e1adf0996fab6585b29f10668836ac6151"

RPROVIDES:${PN} += "config(opensm) \
opensm \
opensm(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libopensm.so.9()(64bit) \
libosmcomp.so.5()(64bit) \
libosmvendor.so.5()(64bit) \
logrotate \
systemd"

inherit rpm
