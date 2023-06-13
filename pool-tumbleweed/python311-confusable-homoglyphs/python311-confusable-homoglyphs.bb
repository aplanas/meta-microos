SUMMARY = "Detector for confusable use of Unicode homoglyphs"
DESCRIPTION = "A Python module to detect Unicode homoglyphs and homograph attacks. \
Homoglyphs are characters that may appear the same but have different \
codepoints, meaning or representation, for example U+0041 LATIN \
CAPITAL LETTER A ('A') vs. U+0391 GREEK CAPITAL LETTER ALPHA, 'Α'."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python311-confusable-homoglyphs-3.2.0-3.9.noarch.rpm"
RPM_HASH = "cec7747ac69dd74d0f3d445c7f15a1982d54f7318074a02a8f9c98364808652560e4bb599b6a92ef87b1bcb3b812ad8b9f8dc85a427af6a693fa9ff92f9ae71f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(confusable-homoglyphs) \
python311-confusable-homoglyphs \
python3dist(confusable-homoglyphs)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-click \
update-alternatives"

inherit rpm
