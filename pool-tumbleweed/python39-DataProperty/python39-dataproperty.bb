SUMMARY = "Python library for extract property from data"
DESCRIPTION = "Python library for extract property from data."
LICENSE = "MIT"

PV = "0.55.1"

RPM_NAME = "python39-DataProperty-0.55.1-1.1.noarch.rpm"
RPM_HASH = "2e9393c2467092de97f488242be710a90cee7de5640e61f02573e71b443cf3fda32d59657c9d85042342a578a2d2ec477e84b3b7d8cf9b2c1798cf4e60dac0bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dataproperty) \
python39-DataProperty \
python3dist(dataproperty)"

RDEPENDS:${PN} += "python(abi) \
python39-mbstrdecoder \
python39-typepy"

inherit rpm
