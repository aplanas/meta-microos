SUMMARY = "A Russian-specific string utility module"
DESCRIPTION = "Tools for processing strings in Russian (choosing proper form for plurals, \
in-words representation of numerals, dates in Russian without locales, \
transliteration, etc.)"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python39-pytils-0.4.1-2.3.noarch.rpm"
RPM_HASH = "024c954b3b651f90865af813e7863b51f3cb22f90870baf69af44d6c97fd1f264929a5e1fbec71dbc454aae3a7ee61a425234eed3ddcf7810a70e31670472a9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytils \
python39-pytils \
python3dist-pytils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
