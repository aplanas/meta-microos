SUMMARY = "The GNU Compiler Transactional Memory Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fgnu-tm option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.2.1+git7683"

RPM_NAME = "libitm1-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "18e71725107798a754b173a31dc56a217ff17308c127f0d43a1ecf246ecb29b1ebf17cb725e666cc8ccb93470f0be5e3294665503cbbc16c1b55451bad6069e7"

RPROVIDES:${PN} += "libitm.so.1 \
libitm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
