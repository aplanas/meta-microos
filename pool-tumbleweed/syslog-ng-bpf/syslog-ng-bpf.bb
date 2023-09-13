SUMMARY = "Faster UDP log collection for syslog-ng"
DESCRIPTION = "This package provides faster UDP log collection for syslog-ng using bpf"
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-bpf-4.3.1-1.3.aarch64.rpm"
RPM_HASH = "c92f76ba84e41faf3e5f88870550676f1c1d2fe465bdc60fb1e763bd0823072993234b1f0057fa989602ecf4ceff0e4696f49636c96b1a14f381d0034ceed1d5"

RPROVIDES:${PN} += "syslog-ng-bpf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbpf.so.1 \
libc.so.6 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
