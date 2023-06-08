SUMMARY = "CJK Unicode Font Kai Style"
DESCRIPTION = "This font was taken from the from the TrueType fonts generously \
released by Arphic Technologies Taiwan under the Arphic Public License. \
It was modified with Fontforge by Arne Goetje <arne@linux.org.tw> to \
contain both Big5 and GB2312 charsets plus some european characters. \
 \
Currently it fully supports the following charsets: \
ISO8859-1,2,3,4,7,9,10,13,14,15 Big5 GB2312-80 Bopomofo Extensions for \
Hakka, Minnan (Unicode 4.0) and MBE variants using the Stylistic \
Alternatives (salt) feature from the OTF spec. \
 \
Partly support is implemented for: HKSCS CNS 11643 GB18030 Japanese \
Korean"
LICENSE = "Arphic-1999"

PV = "0.2.20080216.1"

RPM_NAME = "arphic-ukai-fonts-0.2.20080216.1-100.2.noarch.rpm"
RPM_HASH = "3acf8257acebd529da4d6fec730f31d4a6691bd2b2dbb776c343a844224fbf7b1a44182b912b9bb6f5860b97f088c2bce468b55bd36e8b18b27b8af254b4ed6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arphic-ukai-fonts locale(zh_TW;zh_HK;zh_CN;zh_SG;zh_MO) scalable-font-zh-CN scalable-font-zh-HK scalable-font-zh-MO scalable-font-zh-SG scalable-font-zh-TW ttf-arphic-ukai"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
