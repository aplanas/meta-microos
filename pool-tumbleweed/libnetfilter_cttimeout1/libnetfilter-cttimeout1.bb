SUMMARY = "Userspace library for the Netfilter Conntrack Timeout extension"
DESCRIPTION = "This library provides the programming interface (API) to the \
Netfilter extended timeout settings infrastructure."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "libnetfilter_cttimeout1-1.0.1-1.5.aarch64.rpm"
RPM_HASH = "dad0d59a7b84218ef07b61726550510fadbad88063f3a3c11d0f358b21676c8713310cfde0c1bcf7427387a165768406639ff1cc72dddd2e590b8d04b6ee98a3"

RPROVIDES:${PN} += "libnetfilter-cttimeout.so.1 \
libnetfilter-cttimeout1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0"

inherit rpm
