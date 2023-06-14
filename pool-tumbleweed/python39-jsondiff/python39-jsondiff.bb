SUMMARY = "Module to diff JSON and JSON-like structures in Python"
DESCRIPTION = "Package to show differences between JSON and JSON-like structures in Python"
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-jsondiff-2.0.0-1.6.noarch.rpm"
RPM_HASH = "399695289d45a2dee8518391792ad00bf6c4d53b6f61cf192be9319bfbb686f8a664bc016009fd4d95f3fedb8845c4491459e32b584dd3be6535f211ec6676f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jsondiff \
python39-jsondiff \
python3dist-jsondiff"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
