SUMMARY = "A decorator for caching properties in classes"
DESCRIPTION = "A decorator for caching properties in classes. It makes caching of time or \
computational expensive properties quick and easy and it works in Python 2 \
and 3."
LICENSE = "BSD-3-Clause"

PV = "1.5.2"

RPM_NAME = "python310-cached-property-1.5.2-4.3.noarch.rpm"
RPM_HASH = "637519863a3da1c2aea5e9506cb791dd8fa97e30613a25ce879d77d204e7d7e25fa746b3d5baaf537807714a67fb39844372b610c6919c3a40f77a4458820ab4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cached-property \
python310-cached-property \
python3dist-cached-property"

RDEPENDS:${PN} += "python-abi"

inherit rpm
