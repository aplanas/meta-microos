SUMMARY = "Virtual Host Metrics Daemon (vhostmd)"
DESCRIPTION = "vhostmd provides a 'metrics communication channel' between a host and \
its hosted virtual machines, allowing limited introspection of host \
resource usage from within virtual machines."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1"

RPM_NAME = "vhostmd-1.1-5.6.aarch64.rpm"
RPM_HASH = "2e6f258dd0448c0b41182ba534e3657073de3ce0d65d521ed617c6f557ad88e50bccf6959d673483e308d0a5de1afddc1dc4acb89b83241e3e0da707476f658e"

RPROVIDES:${PN} += "config(vhostmd) \
vhostmd \
vhostmd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libvirt.so.0()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
