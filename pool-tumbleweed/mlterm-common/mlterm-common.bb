SUMMARY = "Multilingual Terminal Emulator common files"
DESCRIPTION = "Common files for Mlterm multilingual terminal emulator"
LICENSE = "BSD-3-Clause"

PV = "3.9.3"

RPM_NAME = "mlterm-common-3.9.3-2.1.aarch64.rpm"
RPM_HASH = "0ab13ead48933818228854904b24563b4b41e36e6237da12a96f80bc3b5af959867e5988d4c1dc1eacde9a3bd5b76275f73318165c29cc197c1ef02af07bfd96"

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
