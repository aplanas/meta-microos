SUMMARY = "The python pandas[spss] extra"
DESCRIPTION = "This package provides the [spss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-pandas-spss-2.1.0-1.2.noarch.rpm"
RPM_HASH = "2b5ee5bf1209d3d7b77a25e643e705709511e7c5ddb71e9593b2e7c2d027c1a83084b5c8c0c4277f95d785dfcbdaa7a956a240fb5544329ea1b8a3b11e8e365c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-spss \
python311-pandas-spss"

RDEPENDS:${PN} += "python311-pandas \
python311-pyreadstat"

inherit rpm
