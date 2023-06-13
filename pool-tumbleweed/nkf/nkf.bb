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

RPM_NAME = "nkf-2.1.5-1.18.aarch64.rpm"
RPM_HASH = "64c9626cb181f1b05182c1df6c0cf3478feaf617ec47bea54fb2278d6d3cfd29147607a1035bef6792673b8aab60052f8a4036f8ad4136a48fcf6b37b79f73ba"

RPROVIDES:${PN} += "locale(ja) \
nkf \
nkf(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
perl"

inherit rpm
