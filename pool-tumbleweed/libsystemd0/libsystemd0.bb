SUMMARY = "Component library for systemd"
DESCRIPTION = "This library provides several of the systemd C APIs: \
 \
* sd-bus implements an alternative D-Bus client library that is \
  relatively easy to use, very efficient and supports both classic \
  D-Bus as well as kdbus as transport backend. \
 \
* sd-daemon(3): for system services (daemons) to report their status \
  to systemd and to make easy use of socket-based activation logic \
 \
* sd-event is a generic event loop abstraction that is built around \
  Linux epoll, but adds features such as event prioritization or \
  efficient timer handling. \
 \
* sd-id128(3): generation and processing of 128-bit IDs \
 \
* sd-journal(3): API to submit and query journal log entries \
 \
* sd-login(3): APIs to introspect and monitor seat, login session and \
  user status information on the local system."
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "libsystemd0-253.4-2.1.aarch64.rpm"
RPM_HASH = "c42f8bc3d98c08bd13e293094855a12421d7560e8fe67f1bb3d35011dff9c4662925591f5699704b9423f964267302793674be24727e1990529b58eb1e3bb23a"

RPROVIDES:${PN} += "libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libsystemd.so.0(LIBSYSTEMD_211)(64bit) \
libsystemd.so.0(LIBSYSTEMD_213)(64bit) \
libsystemd.so.0(LIBSYSTEMD_214)(64bit) \
libsystemd.so.0(LIBSYSTEMD_216)(64bit) \
libsystemd.so.0(LIBSYSTEMD_217)(64bit) \
libsystemd.so.0(LIBSYSTEMD_219)(64bit) \
libsystemd.so.0(LIBSYSTEMD_220)(64bit) \
libsystemd.so.0(LIBSYSTEMD_221)(64bit) \
libsystemd.so.0(LIBSYSTEMD_222)(64bit) \
libsystemd.so.0(LIBSYSTEMD_226)(64bit) \
libsystemd.so.0(LIBSYSTEMD_227)(64bit) \
libsystemd.so.0(LIBSYSTEMD_229)(64bit) \
libsystemd.so.0(LIBSYSTEMD_230)(64bit) \
libsystemd.so.0(LIBSYSTEMD_231)(64bit) \
libsystemd.so.0(LIBSYSTEMD_232)(64bit) \
libsystemd.so.0(LIBSYSTEMD_233)(64bit) \
libsystemd.so.0(LIBSYSTEMD_234)(64bit) \
libsystemd.so.0(LIBSYSTEMD_236)(64bit) \
libsystemd.so.0(LIBSYSTEMD_237)(64bit) \
libsystemd.so.0(LIBSYSTEMD_238)(64bit) \
libsystemd.so.0(LIBSYSTEMD_239)(64bit) \
libsystemd.so.0(LIBSYSTEMD_240)(64bit) \
libsystemd.so.0(LIBSYSTEMD_241)(64bit) \
libsystemd.so.0(LIBSYSTEMD_243)(64bit) \
libsystemd.so.0(LIBSYSTEMD_245)(64bit) \
libsystemd.so.0(LIBSYSTEMD_246)(64bit) \
libsystemd.so.0(LIBSYSTEMD_247)(64bit) \
libsystemd.so.0(LIBSYSTEMD_248)(64bit) \
libsystemd.so.0(LIBSYSTEMD_249)(64bit) \
libsystemd.so.0(LIBSYSTEMD_250)(64bit) \
libsystemd.so.0(LIBSYSTEMD_251)(64bit) \
libsystemd.so.0(LIBSYSTEMD_252)(64bit) \
libsystemd.so.0(LIBSYSTEMD_253)(64bit) \
libsystemd0 \
libsystemd0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.35)(64bit) \
libcap.so.2()(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
liblz4.so.1()(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
