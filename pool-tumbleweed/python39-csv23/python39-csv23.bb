SUMMARY = "Python 2/3 unicode CSV compatibility layer"
DESCRIPTION = "Python 2/3 unicode CSV compatibility layer"
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python39-csv23-0.3.4-2.1.noarch.rpm"
RPM_HASH = "7c68af152117d7fa3ab3323a1d001e6a0485c57a799a4b5390eaa52709ad0ee4aba548ba71f5d4c2c31e3d8f1463bc29da2b48602ca226b43ed306b40fafae94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(csv23) \
python39-csv23 \
python3dist(csv23)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
