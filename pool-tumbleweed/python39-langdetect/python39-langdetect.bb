SUMMARY = "Language detection library ported from Google's language-detection"
DESCRIPTION = "python-langdetect is a port of Google's language-detection library to Python. \
It supports 55 languages out of the box: \
af, ar, bg, bn, ca, cs, cy, da, de, el, en, es, et, fa, fi, fr, gu, he, \
hi, hr, hu, id, it, ja, kn, ko, lt, lv, mk, ml, mr, ne, nl, no, pa, pl, \
pt, ro, ru, sk, sl, so, sq, sv, sw, ta, te, th, tl, tr, uk, ur, vi, zh-cn, zh-tw"
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "python39-langdetect-1.0.9-2.1.noarch.rpm"
RPM_HASH = "134f027a2072627bf2bc2191eb005b513904558bfe63b22e383959ea8879f01b976e9adccd7d307996fa5faa1c7882551084d3d92024c96bebf7fbadc147483b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-langdetect \
python39-langdetect \
python3dist-langdetect"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
