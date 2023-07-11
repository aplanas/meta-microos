SUMMARY = "Multilingual Terminal Emulator using SDL rendering"
DESCRIPTION = "Mlterm is a multilingual terminal emulator using SDL rendering \
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
* proportional font \
* background image (requires Imlib) \
* multiple pty windows \
* scrollbar plug-in API (unstable)"
LICENSE = "BSD-3-Clause"

PV = "3.9.3"

RPM_NAME = "mlterm-sdl2-3.9.3-1.1.aarch64.rpm"
RPM_HASH = "f14e1264f863358a774e199a04cc68dead39cc8dd5d5e5b1ea34fd2b158d3ca06d8795ba58d5d269741cde010fa5d11fa696e3bf56a338e6e7fb69450d9ddb66"

RPROVIDES:${PN} += "libim-kbd-sdl2.so \
libim-skk-sdl2.so \
locale-ja;ko;zh;ar;he \
mlterm-sdl2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libm.so.6 \
libmef.so.3 \
libmlterm-coreotl.so \
libpobl.so.2 \
mlterm-common"

inherit rpm
