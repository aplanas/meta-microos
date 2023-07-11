SUMMARY = "Language detection library ported from Google's language-detection"
DESCRIPTION = "python-langdetect is a port of Google's language-detection library to Python. \
It supports 55 languages out of the box: \
af, ar, bg, bn, ca, cs, cy, da, de, el, en, es, et, fa, fi, fr, gu, he, \
hi, hr, hu, id, it, ja, kn, ko, lt, lv, mk, ml, mr, ne, nl, no, pa, pl, \
pt, ro, ru, sk, sl, so, sq, sv, sw, ta, te, th, tl, tr, uk, ur, vi, zh-cn, zh-tw"
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "python39-langdetect-1.0.9-2.2.noarch.rpm"
RPM_HASH = "a9b66226a3175bb195b893fccac89a4f346a1f0a1fc603923ff231409e659388ea35b301a497194b6bc84bff0c5de563ad491b9a092ce034172150f5a20c7e98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-langdetect \
python39-langdetect \
python3dist-langdetect"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
