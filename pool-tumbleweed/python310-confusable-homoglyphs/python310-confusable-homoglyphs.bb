SUMMARY = "Detector for confusable use of Unicode homoglyphs"
DESCRIPTION = "A Python module to detect Unicode homoglyphs and homograph attacks. \
Homoglyphs are characters that may appear the same but have different \
codepoints, meaning or representation, for example U+0041 LATIN \
CAPITAL LETTER A ('A') vs. U+0391 GREEK CAPITAL LETTER ALPHA, 'Α'."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python310-confusable-homoglyphs-3.2.0-3.9.noarch.rpm"
RPM_HASH = "b68fdfdd5282fddbbdebb325f7a3943ba69d612e50cbe57d811691f2b8cf8a04d9fd285ae5cb29718ec67bc2dd67f9fdb02769b8d2745ccabe088d94ea4ca6d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-confusable-homoglyphs \
python3.10dist(confusable-homoglyphs) \
python310-confusable-homoglyphs \
python3dist(confusable-homoglyphs)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-click \
update-alternatives"

inherit rpm
