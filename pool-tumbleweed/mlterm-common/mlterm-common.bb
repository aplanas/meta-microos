SUMMARY = "Multilingual Terminal Emulator common files"
DESCRIPTION = "Common files for Mlterm multilingual terminal emulator"
LICENSE = "BSD-3-Clause"

PV = "3.9.2"

RPM_NAME = "mlterm-common-3.9.2-3.3.aarch64.rpm"
RPM_HASH = "3539d2da079d69a8b00c3605919232ed8a9147201462948815432c163d6ebadb7b3bae05709db418739f82d2b03dc71ded290436a772353b98f97948153d4e79"

RPROVIDES:${PN} += "libctl_bidi.so()(64bit) \
libctl_bidi.so(mlterm)(64bit) \
libctl_iscii.so()(64bit) \
libctl_iscii.so(mlterm)(64bit) \
libind_assamese.so()(64bit) \
libind_bengali.so()(64bit) \
libind_gujarati.so()(64bit) \
libind_hindi.so()(64bit) \
libind_iitkeyb.so()(64bit) \
libind_inscript.so()(64bit) \
libind_kannada.so()(64bit) \
libind_malayalam.so()(64bit) \
libind_oriya.so()(64bit) \
libind_punjabi.so()(64bit) \
libind_telugu.so()(64bit) \
libmef.so.3()(64bit) \
libmef.so.3(mef)(64bit) \
libmef_8bits.so()(64bit) \
libmef_jajp.so()(64bit) \
libmef_kokr.so()(64bit) \
libmef_zh.so()(64bit) \
libmlterm_coreotl.so()(64bit) \
libotl.so()(64bit) \
libpobl.so.2()(64bit) \
libptyssh.so()(64bit) \
libzmodem.so()(64bit) \
mlterm-common \
mlterm-common(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
group(tty) \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfontconfig.so.1()(64bit) \
libfribidi.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libssh2.so.1()(64bit)"

inherit rpm
