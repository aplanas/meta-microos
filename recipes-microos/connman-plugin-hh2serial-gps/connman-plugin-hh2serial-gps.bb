SUMMARY = "HH2Serial GPS plugin for connman"
DESCRIPTION = "Provides HH2Serial GPS device support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-plugin-hh2serial-gps-1.41-4.7.aarch64.rpm"
RPM_HASH = "38b63269dd85df146658bf5ae4170f0936dcd293280a9c5debb0cc85e35c4def621281a6f7b63c1d875b9b3c67332a16bc5f37d45ee149f582e93b7aa0370be9"

RPROVIDES:${PN} += "connman-plugin-hh2serial-gps connman-plugin-hh2serial-gps(aarch-64)"
RDEPENDS:${PN} += "connman libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
