SUMMARY = "A Russian-specific string utility module"
DESCRIPTION = "Tools for processing strings in Russian (choosing proper form for plurals, \
in-words representation of numerals, dates in Russian without locales, \
transliteration, etc.)"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python311-pytils-0.4.1-2.2.noarch.rpm"
RPM_HASH = "b852aace1269923929225c7684899ae629b094c3b7b1ee6479e705b05dcf1e9c3a30fc018fd081610df9602787a535d4f023391a200e0f25187a1b47c9602969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytils) \
python311-pytils \
python3dist(pytils)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
