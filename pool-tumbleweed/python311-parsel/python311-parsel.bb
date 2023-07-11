SUMMARY = "Library to extract data from HTML and XML using XPath and CSS selectors"
DESCRIPTION = "Parsel is a library to extract data from HTML and XML using XPath and CSS \
selectors."
LICENSE = "BSD-3-Clause"

PV = "1.7.0"

RPM_NAME = "python311-parsel-1.7.0-1.5.noarch.rpm"
RPM_HASH = "188eda780c5afc6e1b59997a4e33c21faa70e4d87ee4e8a7ff2587d67266b4279362d3607d99cec5a59630d1c03569f68f8678519a49f0685acd9a8bc63adc93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parsel \
python3.11dist-parsel \
python311-parsel \
python3dist-parsel"

RDEPENDS:${PN} += "python-abi \
python311-cssselect \
python311-lxml \
python311-w3lib"

inherit rpm
