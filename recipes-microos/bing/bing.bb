SUMMARY = "A Point-to-Point Bandwidth Measurement Tool"
DESCRIPTION = "Bing determines the real (raw, as opposed to available or average) \
throughput of a link by measuring ICMP echo request round trip times \
for different packet sizes for each end of the link."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "bing-1.0.5-162.18.aarch64.rpm"
RPM_HASH = "1a921d3f3f2a84f2aedde3519287327953b9d33c77a12ccc1bf24db93bccddb490a36c07b51149ff655d46d569a5272c08005404b2507506fdd75215b38096ca"

RPROVIDES:${PN} += "bing bing(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) permissions"

inherit rpm
