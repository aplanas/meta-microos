SUMMARY = "A library providing dummies for socket_wrapper"
DESCRIPTION = "Applications with the need to call socket_wrapper_enabled() should link against \
-lsocket_wrapper_noop in order to resolve the symbol at link time."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "libsocket_wrapper_noop0-1.4.2-2.1.aarch64.rpm"
RPM_HASH = "a0c3525df8e6abf2b6812d6c7c534c72759216cb1d13d0b358adc4c226d2bed253ce67a1ce26be98119eafb3df0886f12db3e7c9223349a28e3f4525aa29880a"

RPROVIDES:${PN} += "libsocket-wrapper-noop.so.0 \
libsocket-wrapper-noop0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
