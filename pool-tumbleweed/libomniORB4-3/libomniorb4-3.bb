SUMMARY = "omniORB libraries"
DESCRIPTION = "Shared libraries providing the omniORB CORBA implementation."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "libomniORB4-3-4.3.0-2.6.aarch64.rpm"
RPM_HASH = "3df7dc2dff176c711bf445d19b9928cf33229dd2c292e6413b5fd766a190b2778a8f2a2651735c989411eb210711c706effc0611c718de20f2377a2271ff3493"

RPROVIDES:${PN} += "libCOS4.so.3()(64bit) \
libCOSDynamic4.so.3()(64bit) \
libomniCodeSets4.so.3()(64bit) \
libomniConnectionMgmt4.so.3()(64bit) \
libomniDynamic4.so.3()(64bit) \
libomniORB4-3 \
libomniORB4-3(aarch-64) \
libomniORB4.so.3()(64bit) \
libomniZIOP4.so.3()(64bit) \
libomniZIOPDynamic4.so.3()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libomnithread.so.4()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
