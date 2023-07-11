SUMMARY = "The unofficial Django swappable models API"
DESCRIPTION = "Swapper is an unofficial API for the undocumented but very \
powerful Django feature: swappable models. Swapper facilitates \
implementing arbitrary swappable models in your own reusable apps."
LICENSE = "MIT"

PV = "1.1.2.post1"

RPM_NAME = "python39-swapper-1.1.2.post1-2.9.noarch.rpm"
RPM_HASH = "30fd484b58bb2db88ab5f5e80aad8bdba63db6c9c15d77693c4b0253a268e4e91c40cca3a0f50adb8c9dfe5fcfe6bf8bed8038984c6c6879bab1360b83b8fdf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-swapper \
python39-swapper \
python3dist-swapper"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
