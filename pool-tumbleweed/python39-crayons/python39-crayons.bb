SUMMARY = "Colored strings for terminal usage"
DESCRIPTION = "Crayons is a simple module to give you colored strings for terminal usage. \
Included colors are red, green, yellow, blue, black, magenta, cyan, white, \
and normal."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-crayons-0.4.0-3.10.noarch.rpm"
RPM_HASH = "790746648120814b8d988406a990285b78b106176b0d321b54eeeeda0aa3439d09d27963a4724badfe88e6c2e45c3f89cff290b92d5fc63abd5d9786d2709710"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-crayons \
python39-crayons \
python3dist-crayons"

RDEPENDS:${PN} += "python-abi \
python39-colorama"

inherit rpm
