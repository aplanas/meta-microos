SUMMARY = "Generate source code for Python classes from a JSON schema"
DESCRIPTION = "Generate source code for Python classes from a JSON schema."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "python311-jschema-to-python-1.2.3-1.8.noarch.rpm"
RPM_HASH = "25945522b2a4b2a7907227e42a0cfb24d0c603c5370b0e20cf0400401f4c0ce98f57f9ecc136e510d941560b88251c0f3e522c218ffa61554bc01bb42b3160b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jschema-to-python \
python3.11dist-jschema-to-python \
python311-jschema-to-python \
python3dist-jschema-to-python"

RDEPENDS:${PN} += "python-abi \
python311-attrs \
python311-jsonpickle \
python311-pbr"

inherit rpm
