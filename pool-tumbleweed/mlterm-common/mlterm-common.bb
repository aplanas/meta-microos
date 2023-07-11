SUMMARY = "Multilingual Terminal Emulator common files"
DESCRIPTION = "Common files for Mlterm multilingual terminal emulator"
LICENSE = "BSD-3-Clause"

PV = "3.9.3"

RPM_NAME = "mlterm-common-3.9.3-1.1.aarch64.rpm"
RPM_HASH = "bff1bab0f6e9c01a1c460b3ddf8893bee780da7bb7ea00f7891f3cfab00af318330289c8d791bda3d77c9c2d5104f707c46c3d798e3da5cd70e0f59d4e482e68"

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
