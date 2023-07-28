SUMMARY = "IPython-enabled pdb"
DESCRIPTION = "ipdb exports functions to access the IPython_ debugger, which features \
tab completion, syntax highlighting, better tracebacks, better \
introspection with the same interface as the `pdb` module."
LICENSE = "BSD-3-Clause"

PV = "0.13.13"

RPM_NAME = "python39-ipdb-0.13.13-2.1.noarch.rpm"
RPM_HASH = "6c30ab98893d8806f3b1b956dd792cc1d12b99b3fdb681ae30463625db893d956d9ae084b0bcb19ae863b0c05f7bc8c4ab402e31c8f91b1f1d0740900d930f86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipdb \
python39-ipdb \
python39-jupyter-ipdb \
python3dist-ipdb"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-decorator \
update-alternatives"

inherit rpm
