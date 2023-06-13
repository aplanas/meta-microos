SUMMARY = "CJK Unicode Font Ming Style"
DESCRIPTION = "This font was taken from the from the TrueType fonts generously \
released by Arphic Technologies Taiwan under the Arphic Public License. \
It was modified with Fontforge by Arne Goetje <arne@linux.org.tw> to \
contain both Big5 and GB2312 charsets plus some european characters. \
 \
Currently it fully supports the following charsets: \
ISO8859-1,2,3,4,9,10,13,14,15 Big5 GB2312-80 HKSCS 2004 Bopomofo \
Extensions for Hakka, Minnan (Unicode 4.0) and MBE variants using the \
Alternatives (aalt) feature from the OTF spec. \
 \
Partly support is implemented for: CNS 11643 GB18030 Japanese Korean"
LICENSE = "Arphic-1999"

PV = "0.2.20080216.1"

RPM_NAME = "arphic-uming-fonts-0.2.20080216.1-100.2.noarch.rpm"
RPM_HASH = "2146871feb1df7cac278ddafb14d7b622026308be436d3d258765ae53ba0d11fe96df10dbc9276ac9f746a2ca931a4b48cb4cb826821afbf8f562efac008a9d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arphic-uming-fonts \
locale(zh_TW;zh_HK;zh_CN;zh_SG;zh_MO) \
scalable-font-zh-CN \
scalable-font-zh-HK \
scalable-font-zh-MO \
scalable-font-zh-SG \
scalable-font-zh-TW \
ttf-arphic-uming"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
