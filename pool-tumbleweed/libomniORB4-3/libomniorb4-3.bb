SUMMARY = "omniORB libraries"
DESCRIPTION = "Shared libraries providing the omniORB CORBA implementation."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "libomniORB4-3-4.3.0-2.6.aarch64.rpm"
RPM_HASH = "3df7dc2dff176c711bf445d19b9928cf33229dd2c292e6413b5fd766a190b2778a8f2a2651735c989411eb210711c706effc0611c718de20f2377a2271ff3493"

RPROVIDES:${PN} += "libCOS4.so.3 \
libCOSDynamic4.so.3 \
libomniCodeSets4.so.3 \
libomniConnectionMgmt4.so.3 \
libomniDynamic4.so.3 \
libomniORB4-3 \
libomniORB4.so.3 \
libomniZIOP4.so.3 \
libomniZIOPDynamic4.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libomnithread.so.4 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
