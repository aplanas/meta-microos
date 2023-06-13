SUMMARY = "A python package that provides useful locks"
DESCRIPTION = "A python package that provides useful locks \
It includes the following. \
 * Locking decorator \
 * Reader-writer locks \
 * Inter-process locks \
 * Generic helpers"
LICENSE = "Apache-2.0"

PV = "0.17.3"

RPM_NAME = "python311-fasteners-0.17.3-1.4.noarch.rpm"
RPM_HASH = "94ae003d84bf9aed88f70a7d706fa07399ab48d423d2ff0a1095ba25181d210769bc00fd3f207f767ef93954a0ef0410e1c13bf5c104e2517cfb71a453ac9ffe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fasteners) \
python311-fasteners \
python3dist(fasteners)"

RDEPENDS:${PN} += "python(abi) \
python311-more-itertools \
python311-six"

inherit rpm
