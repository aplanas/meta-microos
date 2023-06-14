SUMMARY = "Language detection library ported from Google's language-detection"
DESCRIPTION = "python-langdetect is a port of Google's language-detection library to Python. \
It supports 55 languages out of the box: \
af, ar, bg, bn, ca, cs, cy, da, de, el, en, es, et, fa, fi, fr, gu, he, \
hi, hr, hu, id, it, ja, kn, ko, lt, lv, mk, ml, mr, ne, nl, no, pa, pl, \
pt, ro, ru, sk, sl, so, sq, sv, sw, ta, te, th, tl, tr, uk, ur, vi, zh-cn, zh-tw"
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "python311-langdetect-1.0.9-2.1.noarch.rpm"
RPM_HASH = "6356c70001f424443df96c3e4f7db6fff223ba66a8911050733cd53846d02094e8e32164023dc51e8e90d1328451d35ef3716f29d51fc5096ef38e475ffd0680"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-langdetect \
python311-langdetect \
python3dist-langdetect"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
