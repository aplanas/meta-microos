SUMMARY = "Memory usage monitoring tool"
DESCRIPTION = "Smemstat reports the physical memory usage taking into consideration shared \
memory. The tool can either report a current snapshot of memory usage or \
periodically dump out any changes in memory."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.11"

RPM_NAME = "smemstat-0.02.11-1.2.aarch64.rpm"
RPM_HASH = "667d074c7872156865579a1ae75f80d519ab681e1633ebd5b60e1ce990b8ae635360fee2d4c4b49a904cccf70e92cc5e7b48693525f0ddcae28fcc969d6e975f"

RPROVIDES:${PN} += "smemstat \
smemstat(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libncursesw.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
