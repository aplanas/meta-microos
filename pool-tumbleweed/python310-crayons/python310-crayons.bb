SUMMARY = "Colored strings for terminal usage"
DESCRIPTION = "Crayons is a simple module to give you colored strings for terminal usage. \
Included colors are red, green, yellow, blue, black, magenta, cyan, white, \
and normal."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-crayons-0.4.0-3.8.noarch.rpm"
RPM_HASH = "82b6727794b672be3945ff0da08b15f05a6f2e7d5199722f2b55b1ba0b5b681ed607e6ae63dc7afb41f909231e2458f103a2df11699289b7b3c82e0f1bd0a146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-crayons \
python3.10dist(crayons) \
python310-crayons \
python3dist(crayons)"

RDEPENDS:${PN} += "python(abi) \
python310-colorama"

inherit rpm
