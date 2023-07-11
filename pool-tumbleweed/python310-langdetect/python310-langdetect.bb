SUMMARY = "Language detection library ported from Google's language-detection"
DESCRIPTION = "python-langdetect is a port of Google's language-detection library to Python. \
It supports 55 languages out of the box: \
af, ar, bg, bn, ca, cs, cy, da, de, el, en, es, et, fa, fi, fr, gu, he, \
hi, hr, hu, id, it, ja, kn, ko, lt, lv, mk, ml, mr, ne, nl, no, pa, pl, \
pt, ro, ru, sk, sl, so, sq, sv, sw, ta, te, th, tl, tr, uk, ur, vi, zh-cn, zh-tw"
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "python310-langdetect-1.0.9-2.2.noarch.rpm"
RPM_HASH = "4f010d80b68f14306bb09f1a6b796e580c8efd4db726760526a520ad0543c8a4ddf67db2f0f56d53d887451959a6caf12969a2b9919579033632a27e5d830ab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-langdetect \
python310-langdetect \
python3dist-langdetect"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
