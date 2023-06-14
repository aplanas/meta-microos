SUMMARY = "NUMA Policy Control"
DESCRIPTION = "Control NUMA policy for individual processes. Offer libnuma for \
individual NUMA policy in applications."
LICENSE = "GPL-2.0-only"

PV = "2.0.16.21.g693fee1"

RPM_NAME = "numactl-2.0.16.21.g693fee1-1.1.aarch64.rpm"
RPM_HASH = "5af88761faf247749ffce0aee2cbe632f365badac481ac082e91eb348c9ba4b47b935fe2551351fafa6c602cc003d6b3909d114820262de5748d24621915fdd6"

RPROVIDES:${PN} += "numactl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnuma.so.1"

inherit rpm
