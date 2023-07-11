SUMMARY = "Detector for confusable use of Unicode homoglyphs"
DESCRIPTION = "A Python module to detect Unicode homoglyphs and homograph attacks. \
Homoglyphs are characters that may appear the same but have different \
codepoints, meaning or representation, for example U+0041 LATIN \
CAPITAL LETTER A ('A') vs. U+0391 GREEK CAPITAL LETTER ALPHA, 'Α'."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python39-confusable-homoglyphs-3.2.0-3.11.noarch.rpm"
RPM_HASH = "68119cf5711781d75e8e21dd72755f610864347f4728d5193b0c8ad9db73b165c31a0948a3b63da164bbc31917df7c5043ba2183f143f29466fab5426b03bb42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-confusable-homoglyphs \
python39-confusable-homoglyphs \
python3dist-confusable-homoglyphs"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
update-alternatives"

inherit rpm
