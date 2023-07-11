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

PV = "3.9.3"

RPM_NAME = "mlterm-3.9.3-1.1.aarch64.rpm"
RPM_HASH = "c15fb7e6cef4824ea3d35ab2154f177eb4010b788b5b62a481bb3f4153940ad090b34e6842826f7d3c644627ade42c710ee7a93317483c9fbfd7df7deb284e26"

RPROVIDES:${PN} += "config-mlterm \
libathena.so \
libim-kbd-wl.so \
libim-kbd.so \
libim-skk-wl.so \
libim-skk.so \
libmotif.so \
libmozmodern.so \
libnext.so \
libpixmap-engine.so \
libsample.so \
libtype-cairo.so \
locale-xorg-x11-ja;ko;zh;ar;he \
mlterm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmef.so.3 \
libmlterm-coreotl.so \
libpobl.so.2 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libxkbcommon.so.0 \
mlterm-common"

inherit rpm
