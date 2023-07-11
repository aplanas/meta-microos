SUMMARY = "A python package that provides useful locks"
DESCRIPTION = "A python package that provides useful locks \
It includes the following. \
 * Locking decorator \
 * Reader-writer locks \
 * Inter-process locks \
 * Generic helpers"
LICENSE = "Apache-2.0"

PV = "0.17.3"

RPM_NAME = "python311-fasteners-0.17.3-1.6.noarch.rpm"
RPM_HASH = "b63472a2f83bdcd342c79a63da12f5d1855278cfd7571e7741965f964b78b3eb407708f7cb8e7eed82506d42ac05cc17cdaa79076d41fcd45e6d30230226b12c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fasteners \
python3.11dist-fasteners \
python311-fasteners \
python3dist-fasteners"

RDEPENDS:${PN} += "python-abi \
python311-more-itertools \
python311-six"

inherit rpm
