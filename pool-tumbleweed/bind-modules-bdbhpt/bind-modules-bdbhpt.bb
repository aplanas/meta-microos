SUMMARY = "A DLZ module which stores zone data in a BerkeleyDB"
DESCRIPTION = "This package provides the externally loadable bdbhpt DLZ driver, without \
update support"
LICENSE = "MPL-2.0"

PV = "9.18.15"

RPM_NAME = "bind-modules-bdbhpt-9.18.15-1.1.aarch64.rpm"
RPM_HASH = "804dc9d92bad25b10af3449b96b7436295530ea6abb878b8a254dbaeca30275cd00a7b6f000d88a912114779ce402a236c18dbc1f834191a0752c1ec21564bb6"

RPROVIDES:${PN} += "bind-modules-bdbhpt \
bind-modules-bdbhpt(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdb-4.8.so()(64bit)"

inherit rpm
