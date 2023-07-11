SUMMARY = "Technical Analysis Library"
DESCRIPTION = " \
TA-Lib provides common functions for the technical analysis of stock/future/commodity market data."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "libta-devel-0.4.0-1.10.aarch64.rpm"
RPM_HASH = "3467181bdad2a02f74b95ac7d47b00f3405ecd77cbebd245944a82f28aeb999b1f587581cb97222c1e5059b0ea7495ee16e4c189d841f79fcb975b609bd25cb9"

RPROVIDES:${PN} += "libta-devel \
ta-lib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-devel \
libta-lib0"

inherit rpm
