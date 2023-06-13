SUMMARY = "Laptop power measuring tool"
DESCRIPTION = "Powerstat measures the power consumption of a mobile PC that has a battery \
power source. The output is like vmstat but also shows power consumption \
statistics. At the end of a run, powerstat will calculate the average, \
standard deviation and min/max of the gathered data."
LICENSE = "GPL-2.0-only"

PV = "0.03.02"

RPM_NAME = "powerstat-0.03.02-1.1.aarch64.rpm"
RPM_HASH = "b861253159d43dfc51011f4315c9c9193b998c616f9f1e50e19cf6d8d55cc0d44b2b8416f42382d23d36581b21485ebdb3be5b4051b825bd2f81e12356694544"

RPROVIDES:${PN} += "powerstat \
powerstat(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
