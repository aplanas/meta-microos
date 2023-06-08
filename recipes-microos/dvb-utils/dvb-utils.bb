SUMMARY = "Utilities for DVB devices"
DESCRIPTION = "dvb-utils is a collection of various DVB utilities."
LICENSE = "GPL-2.0-only"

PV = "1.24.1"

RPM_NAME = "dvb-utils-1.24.1-1.3.aarch64.rpm"
RPM_HASH = "c4ab48a3a56d7908eeedb8a50273fa6754e9a97de13224c563fb127550191bbe7244152ca16204c91ae0a4cb2644452e54def5c709349b9d1a92c8503c1b0e1a"

RPROVIDES:${PN} += "dvb-utils dvb-utils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdvbv5.so.0()(64bit)"

inherit rpm
