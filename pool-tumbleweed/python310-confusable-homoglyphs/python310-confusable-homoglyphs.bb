SUMMARY = "Detector for confusable use of Unicode homoglyphs"
DESCRIPTION = "A Python module to detect Unicode homoglyphs and homograph attacks. \
Homoglyphs are characters that may appear the same but have different \
codepoints, meaning or representation, for example U+0041 LATIN \
CAPITAL LETTER A ('A') vs. U+0391 GREEK CAPITAL LETTER ALPHA, 'Α'."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python310-confusable-homoglyphs-3.2.0-3.11.noarch.rpm"
RPM_HASH = "f6157a5e1c78da18ae345d4fe33bed1361a5bdb2515ce5afdb56021525d5531a883f3a41c54d61c52d152535bce9bc53e117156683b59c9375b92217aa707b45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-confusable-homoglyphs \
python310-confusable-homoglyphs \
python3dist-confusable-homoglyphs"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
update-alternatives"

inherit rpm
