SUMMARY = "A Russian-specific string utility module"
DESCRIPTION = "Tools for processing strings in Russian (choosing proper form for plurals, \
in-words representation of numerals, dates in Russian without locales, \
transliteration, etc.)"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python310-pytils-0.4.1-2.3.noarch.rpm"
RPM_HASH = "98cb34ea5315accd0fb135c78e1ae81bb84699dce6e62b35a84c7979ef1ff5473912dd22e14ab558668b800e720af080ad8b7e2d6db89b6d3b22d200d9b8650f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytils \
python310-pytils \
python3dist-pytils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
