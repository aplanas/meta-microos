SUMMARY = "Finite-state C library"
DESCRIPTION = "The library contains efficient implementations of all classical \
automata/transducer algorithms: determinization, minimization, \
epsilon-removal, composition, boolean operations. Also, more \
advanced construction methods are available: context restriction, \
quotients, first-order regular logic, transducers from replacement \
rules, etc."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "libfoma0-0.10.0-1.4.aarch64.rpm"
RPM_HASH = "e9127a4428aa7e4fc9373aed2afec99239202fa78f34cfc58658502590a53215d308e18d99ff1f02ccb6451b9d6e15a2c0db407bc31e66688d4a983c7703b213"

RPROVIDES:${PN} += "libfoma.so.0 \
libfoma0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
