SUMMARY = "The GNU Compiler Transactional Memory Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fgnu-tm option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7364"

RPM_NAME = "libitm1-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "48b0c1c07987a8e80211c27870b82b202e81256a28b949de47a4131be9b9ae5bca8c7f1f18e6d6cb0a250c4e691db58351be3598f9d7e42668cb9cfc768f87a4"

RPROVIDES:${PN} += "libitm.so.1 \
libitm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
