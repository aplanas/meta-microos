SUMMARY = "JSON Referencing + Python"
DESCRIPTION = "JSON Referencing + Python"
LICENSE = "MIT"

PV = "0.29.1"

RPM_NAME = "python311-referencing-0.29.1-1.1.noarch.rpm"
RPM_HASH = "67bb71d3e51c2f7304ba27260f376c72de53a302fca3caebd4e0deae0c9bf440337806f2217700337f2f86dd694f933fefdecc4d549e92813e7ca38a48c80403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-referencing \
python3.11dist-referencing \
python311-referencing \
python3dist-referencing"

RDEPENDS:${PN} += "python-abi \
python311-attrs \
python311-rpds-py"

inherit rpm
