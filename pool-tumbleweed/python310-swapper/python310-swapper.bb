SUMMARY = "The unofficial Django swappable models API"
DESCRIPTION = "Swapper is an unofficial API for the undocumented but very \
powerful Django feature: swappable models. Swapper facilitates \
implementing arbitrary swappable models in your own reusable apps."
LICENSE = "MIT"

PV = "1.1.2.post1"

RPM_NAME = "python310-swapper-1.1.2.post1-2.9.noarch.rpm"
RPM_HASH = "a48b295a1170d7a0c2c3fd3b241403e5597b14be15707a076282cb6759af0388f3f81729b4f75b730cd1cae8628545b49674750e0c5671a3b31ad8b6026d4640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-swapper \
python310-swapper \
python3dist-swapper"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
