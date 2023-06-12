SUMMARY = "Python unittest helpers"
DESCRIPTION = "evilunit provides helpers for Python unittest, \
including class level imports, parameterized tests \
and nested test classes."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python311-evilunit-0.2.1-1.12.noarch.rpm"
RPM_HASH = "4ef9a8a719ea05070bf05160b0813fa25a67404a065e5c5c1a1ca12ab9a62c5da040b38748f78bb431efdc2ff36c2c29398f1a7dd237911299b034424337966f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(evilunit) \
python311-evilunit \
python3dist(evilunit)"
RDEPENDS:${PN} += "python(abi) \
python311-setuptools"

inherit rpm
