SUMMARY = "Font for Runic Script"
DESCRIPTION = "A set of six Runic fonts that each cover the subset of 34 characters \
in the Unicode Runic block that are used in Frisian and Anglo-Saxon \
inscriptions from the 5th to 11th centuries."
LICENSE = "OFL-1.1"

PV = "20131112"

RPM_NAME = "babelstone-runic-fonts-20131112-4.1.noarch.rpm"
RPM_HASH = "bb76804c9ae782821dbae05716772da1d2d10ddd2c0b01135bc5bb998d80a07131a2d6d990c09a01193d3e8ee08247ae6760d67b717cf7600a861142df4928bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "babelstone-runic-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
