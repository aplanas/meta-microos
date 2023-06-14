SUMMARY = "A Russian-specific string utility module"
DESCRIPTION = "Tools for processing strings in Russian (choosing proper form for plurals, \
in-words representation of numerals, dates in Russian without locales, \
transliteration, etc.)"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python310-pytils-0.4.1-2.2.noarch.rpm"
RPM_HASH = "9c89c968a501e9b280cc496864d3ce91467bdd47166747fab19671877b6f311884421ef06491bffc065dedd95a7a5a7427616e7ce7d744995008d2f0e0120c30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytils \
python3.10dist-pytils \
python310-pytils \
python3dist-pytils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
