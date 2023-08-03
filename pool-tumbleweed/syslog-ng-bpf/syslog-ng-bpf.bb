SUMMARY = "Faster UDP log collection for syslog-ng"
DESCRIPTION = "This package provides faster UDP log collection for syslog-ng using bpf"
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-bpf-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "5057516af1e1d73c3b09091dcc31faa44f4e1b0d0d2ab385a8a1e3247469ca43fb71d19a33c7abf8f08ad31d4af05063316ffa0357290d5cb8f5eb3c0fec496f"

RPROVIDES:${PN} += "syslog-ng-bpf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbpf.so.1 \
libc.so.6 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
