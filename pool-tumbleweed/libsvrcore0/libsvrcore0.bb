SUMMARY = "Secure PIN handling using NSS crypto"
DESCRIPTION = "svrcore provides applications with several ways to handle secure PIN storage \
e.g. in an application that must be restarted, but needs the PIN to unlock \
the private key and other crypto material, without user intervention.  svrcore \
uses the facilities provided by NSS."
LICENSE = "MPL-2.0"

PV = "2.4.0~git74.4297d88"

RPM_NAME = "libsvrcore0-2.4.0~git74.4297d88-1.1.aarch64.rpm"
RPM_HASH = "0a3af1fad0a2e408994b78d99879a1cbfb9fe05721a9ac3e9a952f3e74434a425514361c5a8897a3b251de07b51ae8e8817196c34c86c38b5720a928c0a2a966"

RPROVIDES:${PN} += "libsvrcore.so.0 \
libsvrcore0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnss3.so"

inherit rpm
