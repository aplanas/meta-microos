SUMMARY = "Development files for libiptc, a packet filter ruleset library"
DESCRIPTION = "libiptc ('iptables cache') is used to retrieve from the kernel, parse, \
construct, and load rulesets into the kernel."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.9"

RPM_NAME = "libiptc-devel-1.8.9-1.4.aarch64.rpm"
RPM_HASH = "ab3359e1551ba8b8b601b4a983ad6a86c988334c524f7bb6222e0aef34f3fa7f6aaf7ca67ea1d97eb6477c19abdc868b573526926da11b44655d19c58ab585f9"

RPROVIDES:${PN} += "libiptc-devel \
pkgconfig-libip4tc \
pkgconfig-libip6tc \
pkgconfig-libiptc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libip4tc2 \
libip6tc2 \
pkgconfig-libip4tc \
pkgconfig-libip6tc"

inherit rpm
