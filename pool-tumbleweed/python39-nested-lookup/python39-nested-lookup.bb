SUMMARY = "Python functions for working with deeply nested documents (lists and dicts)"
DESCRIPTION = "Python functions for working with deeply nested documents (lists and dicts)"
LICENSE = "SUSE-Public-Domain"

PV = "0.2.25"

RPM_NAME = "python39-nested-lookup-0.2.25-1.3.noarch.rpm"
RPM_HASH = "1b4b29a3c48cee7fa1b7cdb45ef15d1ca600553082687451e42433eb720c126e0fd18b1f94e6df8a4485d00aea3d4881bc74b8afa22738980091fb6e2e216e69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(nested-lookup) \
python39-nested-lookup \
python3dist(nested-lookup)"
RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
