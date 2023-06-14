SUMMARY = "Botan python bindings"
DESCRIPTION = "This package contains the python bindings to libbotan's C98 interface."
LICENSE = "BSD-2-Clause"

PV = "2.19.3"

RPM_NAME = "python3-botan-2.19.3-1.4.aarch64.rpm"
RPM_HASH = "85418e593928efa4e9827cc85ba2682c8f84082cb42d980271c6d0a8210612ab3217ac2c235675e56e9b93c88b4b3a75cf17433d6e07494c2353c551750807b5"

RPROVIDES:${PN} += "python3-botan"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3"

inherit rpm
