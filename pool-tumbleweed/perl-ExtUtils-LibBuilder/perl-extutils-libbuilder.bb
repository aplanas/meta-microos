SUMMARY = "Tool to Build C Libraries"
DESCRIPTION = "A tool to build C libraries."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.08"

RPM_NAME = "perl-ExtUtils-LibBuilder-0.08-1.26.noarch.rpm"
RPM_HASH = "22b17417d691baf4802d9d901738d82fc43e39e4ef2763e07bed02ac80772ee0bdb49c2c29a01ae71153df1326e8fb77e8d8be0c1b79922caa4eedf7054f0346"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--LibBuilder \
perl-ExtUtils-LibBuilder"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
