SUMMARY = "Python module to parse Erlang BEAM files"
DESCRIPTION = "Python module to parse Erlang BEAM files, now it is able to read \
imports, exports, atoms, as well as compile info and attribute \
chunks in pretty python format."
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python39-pybeam-0.7-1.12.noarch.rpm"
RPM_HASH = "8c930141b64d17cd0743ef661edd1b9e035d7c7eaf6f4fef1dc39a1e613e77db5e29c00a3615e0caeb575118de8b978db2de414dd9afc546a4540f393bf9ae03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pybeam \
python39-pybeam \
python3dist-pybeam"

RDEPENDS:${PN} += "python-abi \
python39-construct \
python39-six"

inherit rpm
