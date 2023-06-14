SUMMARY = "Language detection library ported from Google's language-detection"
DESCRIPTION = "python-langdetect is a port of Google's language-detection library to Python. \
It supports 55 languages out of the box: \
af, ar, bg, bn, ca, cs, cy, da, de, el, en, es, et, fa, fi, fr, gu, he, \
hi, hr, hu, id, it, ja, kn, ko, lt, lv, mk, ml, mr, ne, nl, no, pa, pl, \
pt, ro, ru, sk, sl, so, sq, sv, sw, ta, te, th, tl, tr, uk, ur, vi, zh-cn, zh-tw"
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "python310-langdetect-1.0.9-2.1.noarch.rpm"
RPM_HASH = "8a6cf3845b5fb47a3d4e8c7152bf06418fc9844c3a4a8371490b232586830ad9dc5cc118ebadd2d35ab9ba92ad753cdb86acd9fcdb906dd329141c24e0b603a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-langdetect \
python3.10dist-langdetect \
python310-langdetect \
python3dist-langdetect"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
