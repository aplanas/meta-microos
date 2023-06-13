SUMMARY = "Development headers and libraries for libapparmor"
DESCRIPTION = "These libraries are needed for developing software that makes use of the \
AppArmor API."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.4"

RPM_NAME = "libapparmor-devel-3.1.4-1.1.aarch64.rpm"
RPM_HASH = "40f55f0de84321d82153cd769ae505c46dd0ea5c31a7f7ecd46669b71041223ff3ca41071197f74c77d85778b627af51e3fd5768df0cbb48f98b207cceebb46e"

RPROVIDES:${PN} += "libapparmor-devel \
libapparmor-devel(aarch-64) \
libapparmor:/usr/include/sys/apparmor.h \
pkgconfig(libapparmor)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libapparmor1"

inherit rpm
