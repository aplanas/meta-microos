SUMMARY = "A Python library to work with countries and languages"
DESCRIPTION = "BabelFish is a Python library to work with countries and languages."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python311-babelfish-0.6.0-1.8.noarch.rpm"
RPM_HASH = "c6981bb862792b0d617f190b95e07877950e900b2a7874a4e14a6d44a158b92ada45fc0d26dd99496dd84f05e31d605b74d0e1e40f80e3d6c07ddf87cec7320e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(babelfish) \
python311-babelfish \
python3dist(babelfish)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
