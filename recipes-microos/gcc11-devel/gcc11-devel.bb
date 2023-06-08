SUMMARY = "GCC plugins development enviroment"
DESCRIPTION = "Files required for developing and compiling GCC plugins."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "gcc11-devel-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "cad1b0ffbb50a40e53dd637f53e0d68d465e194cb5ac27f131e140efba31886478571ee8143e76449b6a05440bb64f79b9242dd3833679b6cc776d3a6615d070"

RPROVIDES:${PN} += "gcc11-devel gcc11-devel(aarch-64)"
RDEPENDS:${PN} += "gcc11 gmp-devel libc.so.6(GLIBC_2.34)(64bit) mpc-devel"

inherit rpm
