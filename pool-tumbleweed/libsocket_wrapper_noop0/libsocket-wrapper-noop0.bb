SUMMARY = "A library providing dummies for socket_wrapper"
DESCRIPTION = "Applications with the need to call socket_wrapper_enabled() should link against \
-lsocket_wrapper_noop in order to resolve the symbol at link time."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "libsocket_wrapper_noop0-1.4.2-1.1.aarch64.rpm"
RPM_HASH = "f95ff9af9d25a705b20394e35cb6f452a7e9bc0a8ec6688d073112c61c86d7e276bff4d1d11804a7c33624da359b75ece5f571bc37b896a700ad0c699727bea2"

RPROVIDES:${PN} += "libsocket-wrapper-noop.so.0 \
libsocket-wrapper-noop0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
