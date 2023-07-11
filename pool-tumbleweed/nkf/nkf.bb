SUMMARY = "Network Kanji Code Conversion Filter"
DESCRIPTION = "Nkf is a yet another Kanji code converter among networks, hosts, and \
terminals. It converts input Kanji code to designated Kanji code, such \
as 7-bit JIS, MS-kanji (shifted-JIS) or EUC. \
 \
One of the most unique facility of nkf is the guess of the input kanji \
code.  It currently recognizes 7-bit JIS, MS-kanji (shifted-JIS), and \
EUC. So users do not need the input Kanji code specification. \
 \
By  default,  X0201  kana is converted into X0208 kana. For X0201 kana, \
SO/SI, SSO and ESC-(-I methods are  supported. For automatic code \
detection, nkf assumes no X0201 kana in MS-Kanji. To accept X0201 in \
MS-Kanji, use -X, -x, or -S."
LICENSE = "BSD-3-Clause"

PV = "2.1.5"

RPM_NAME = "nkf-2.1.5-1.19.aarch64.rpm"
RPM_HASH = "ad1dca568f0b9676dc47f12ca7e308f4406f635307a429660b8bfd0568551e20ff84c1843b15609b55d14bb3e65a51129924b00e9897e3ef7d235ed324ab6d60"

RPROVIDES:${PN} += "locale-ja \
nkf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl"

inherit rpm
