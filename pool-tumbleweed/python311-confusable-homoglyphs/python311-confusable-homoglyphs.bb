SUMMARY = "Detector for confusable use of Unicode homoglyphs"
DESCRIPTION = "A Python module to detect Unicode homoglyphs and homograph attacks. \
Homoglyphs are characters that may appear the same but have different \
codepoints, meaning or representation, for example U+0041 LATIN \
CAPITAL LETTER A ('A') vs. U+0391 GREEK CAPITAL LETTER ALPHA, 'Α'."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python311-confusable-homoglyphs-3.2.0-3.11.noarch.rpm"
RPM_HASH = "cdf62fd358925fe448c305e9af7957c080111f60626346527e2c07ef961f1a63393a827bbcd98ef0ab03ce17325f8d719933ef00bb19cf83c5f0314801905377"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-confusable-homoglyphs \
python3.11dist-confusable-homoglyphs \
python311-confusable-homoglyphs \
python3dist-confusable-homoglyphs"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
update-alternatives"

inherit rpm
