SUMMARY = "Language detection library ported from Google's language-detection"
DESCRIPTION = "python-langdetect is a port of Google's language-detection library to Python. \
It supports 55 languages out of the box: \
af, ar, bg, bn, ca, cs, cy, da, de, el, en, es, et, fa, fi, fr, gu, he, \
hi, hr, hu, id, it, ja, kn, ko, lt, lv, mk, ml, mr, ne, nl, no, pa, pl, \
pt, ro, ru, sk, sl, so, sq, sv, sw, ta, te, th, tl, tr, uk, ur, vi, zh-cn, zh-tw"
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "python311-langdetect-1.0.9-2.2.noarch.rpm"
RPM_HASH = "c4e074e22555a263dc2448be2764f3271c781674cf39e92606c533a1363f734f2c78bdc6028e7bb097d5b76ebfd79bf2f2d1325cae552b2bf6ad04c0bd2547e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-langdetect \
python3.11dist-langdetect \
python311-langdetect \
python3dist-langdetect"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
