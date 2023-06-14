SUMMARY = "Multilingual Terminal Emulator common files"
DESCRIPTION = "Common files for Mlterm multilingual terminal emulator"
LICENSE = "BSD-3-Clause"

PV = "3.9.2"

RPM_NAME = "mlterm-common-3.9.2-3.3.aarch64.rpm"
RPM_HASH = "3539d2da079d69a8b00c3605919232ed8a9147201462948815432c163d6ebadb7b3bae05709db418739f82d2b03dc71ded290436a772353b98f97948153d4e79"

RPROVIDES:${PN} += "libctl-bidi.so \
libctl-iscii.so \
libind-assamese.so \
libind-bengali.so \
libind-gujarati.so \
libind-hindi.so \
libind-iitkeyb.so \
libind-inscript.so \
libind-kannada.so \
libind-malayalam.so \
libind-oriya.so \
libind-punjabi.so \
libind-telugu.so \
libmef-8bits.so \
libmef-jajp.so \
libmef-kokr.so \
libmef-zh.so \
libmef.so.3 \
libmlterm-coreotl.so \
libotl.so \
libpobl.so.2 \
libptyssh.so \
libzmodem.so \
mlterm-common"

RDEPENDS:${PN} += "/sbin/ldconfig \
group-tty \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfribidi.so.0 \
libharfbuzz.so.0 \
libssh2.so.1"

inherit rpm
