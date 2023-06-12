SUMMARY = "Add JSON (de)serialization to your python objects"
DESCRIPTION = "Quickly add json serialization and deserialization \
to your python classes."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "python39-JsonWeb-0.8.2-6.1.noarch.rpm"
RPM_HASH = "ab8f6f44f78145b984474bf60f132ac4b867b507b0d156bc549995f58bf78ed87a66592a0617dba831e7022d448c047e7a2fa9cff6b29affd6bf886050613341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jsonweb) \
python39-JsonWeb \
python3dist(jsonweb)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
