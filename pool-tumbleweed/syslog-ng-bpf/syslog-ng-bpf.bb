SUMMARY = "Faster UDP log collection for syslog-ng"
DESCRIPTION = "This package provides faster UDP log collection for syslog-ng using bpf"
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-bpf-4.3.1-1.2.aarch64.rpm"
RPM_HASH = "d14261b92bdeb3435e14bbada1e77925ddfe26e91ee33f3ea8ffbf5dbfa852ceaac663fe00230c653d90a655f29948a9c46a36dd11e808d4bf4a9e7ca3f8e7c5"

RPROVIDES:${PN} += "syslog-ng-bpf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbpf.so.1 \
libc.so.6 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
