SUMMARY = "IPython-enabled pdb"
DESCRIPTION = "ipdb exports functions to access the IPython_ debugger, which features \
tab completion, syntax highlighting, better tracebacks, better \
introspection with the same interface as the `pdb` module."
LICENSE = "BSD-3-Clause"

PV = "0.13.13"

RPM_NAME = "python311-ipdb-0.13.13-2.1.noarch.rpm"
RPM_HASH = "1f0d8c8c169524fc904945b0238bd8e26c5fcd53e893405516ec9841720aec3651e9f76d9c2bc853ef79a47537817d3c0a7fc630488fdfe14aa46c1f4f3bf156"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipdb \
python3-ipdb \
python3-jupyter-ipdb \
python3.11dist-ipdb \
python311-ipdb \
python311-jupyter-ipdb \
python3dist-ipdb"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-decorator \
update-alternatives"

inherit rpm
