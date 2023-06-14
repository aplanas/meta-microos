SUMMARY = "Generate source code for Python classes from a JSON schema"
DESCRIPTION = "Generate source code for Python classes from a JSON schema."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "python310-jschema-to-python-1.2.3-1.6.noarch.rpm"
RPM_HASH = "6d7118f6c6b1d0c775e9f07e5bbb128c1ae23cbf57abb7fed78a1b61a4ebdc94593ccd2030769fc9479950227e640d8ed34856b98f4495a341a3bca4a30b27d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jschema-to-python \
python3.10dist-jschema-to-python \
python310-jschema-to-python \
python3dist-jschema-to-python"

RDEPENDS:${PN} += "python-abi \
python310-attrs \
python310-jsonpickle \
python310-pbr"

inherit rpm
