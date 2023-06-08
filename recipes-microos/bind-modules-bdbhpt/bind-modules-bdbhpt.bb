SUMMARY = "A DLZ module which stores zone data in a BerkeleyDB"
DESCRIPTION = "This package provides the externally loadable bdbhpt DLZ driver, without \
update support"
LICENSE = "MPL-2.0"

PV = "9.18.14"

RPM_NAME = "bind-modules-bdbhpt-9.18.14-1.1.aarch64.rpm"
RPM_HASH = "4b2f145171eda6e5ea5a031b55b79dafcad16fae72e99aef01b566555978c7b612062bcbc864f31bf15282a0c00874f982abd6b414bcead5447a0b9d6b02dd2e"

RPROVIDES:${PN} += "bind-modules-bdbhpt bind-modules-bdbhpt(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdb-4.8.so()(64bit)"

inherit rpm
