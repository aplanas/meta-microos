SUMMARY = "A Russian-specific string utility module"
DESCRIPTION = "Tools for processing strings in Russian (choosing proper form for plurals, \
in-words representation of numerals, dates in Russian without locales, \
transliteration, etc.)"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python311-pytils-0.4.1-2.3.noarch.rpm"
RPM_HASH = "cb11fa3f0448f818e01d2a178168e8dcda5e5cbcec1bb426f452fc4d6fb8082a8d8870c7952f23a205d1eedc6d9a65fe66ca51b88ee83045924ad679fbe7e61b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytils \
python3.11dist-pytils \
python311-pytils \
python3dist-pytils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
