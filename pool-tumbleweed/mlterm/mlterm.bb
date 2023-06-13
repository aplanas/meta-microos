SUMMARY = "Multilingual Terminal Emulator for X and Wayland"
DESCRIPTION = "Mlterm is a multilingual terminal emulator for the X Window System and Wayland. \
 \
Multilingual features: \
 \
supported charsets: US_ASCII, ISO8859[1-11], ISO8859[13-16], TCVN5712, \
VISCII, KOI8_R, KOI8_U, JISX0201, JISX0208, JISX0212, JISX0213, GB2312, \
GBK, KSC5601, UHC, CNS11643-N, Big5, UCS2(4) \
 \
supported encodings: ISO-8859-[1-11], ISO-8859- [13-16], TCVN5612, \
VISCII, KOI8_R, KOI8_U, EUC-JP, EUC-JISX0213, ISO-2022-JP [1, 2, 3], \
Shift_JIS, Shift_JISX0213, EUC-KR, UHC, JOHAB, ISO-2022-KR, \
ISO-2022-CN, GB2312(EUC-CN), GBK, GB18030, EUC-TW, Big5, Hz, UTF-8 \
 \
character composition: TIS620, TCVN5712, JISX0213, UNICODE \
 \
Multiple IMs are also supported and you can dynamically change various \
IMs. \
 \
Other features: \
* scroll by wheel mouse \
* antialias font (requires Xft and Xrender extensions) \
* proportional font \
* transparent background \
* background image (requires Imlib) \
* multiple pty windows \
* scrollbar plug-in API (unstable)"
LICENSE = "BSD-3-Clause"

PV = "3.9.2"

RPM_NAME = "mlterm-3.9.2-3.3.aarch64.rpm"
RPM_HASH = "3caf97a4d868e88ea2f1658c1017d18845a58f891bfe5b9e5b50828c8eed89b89ed7adde48f9fc93960eb784a278d829ac5f1fe1546aa3dae92fb32c08027625"

RPROVIDES:${PN} += "application() \
application(mlterm.desktop) \
config(mlterm) \
libathena.so()(64bit) \
libim-kbd-wl.so()(64bit) \
libim-kbd.so()(64bit) \
libim-skk-wl.so()(64bit) \
libim-skk.so()(64bit) \
libmotif.so()(64bit) \
libmozmodern.so()(64bit) \
libnext.so()(64bit) \
libpixmap_engine.so()(64bit) \
libsample.so()(64bit) \
libtype_cairo.so()(64bit) \
libtype_cairo.so(mlterm)(64bit) \
locale(xorg-x11:ja;ko;zh;ar;he) \
mlterm \
mlterm(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmef.so.3()(64bit) \
libmef.so.3(mef)(64bit) \
libmlterm_coreotl.so()(64bit) \
libpobl.so.2()(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-cursor.so.0()(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit) \
mlterm-common"

inherit rpm
