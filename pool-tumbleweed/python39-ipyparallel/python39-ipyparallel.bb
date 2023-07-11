SUMMARY = "Interactive parallel computing library for IPython"
DESCRIPTION = "Use multiple instances of IPython in parallel, interactively. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "8.6.1"

RPM_NAME = "python39-ipyparallel-8.6.1-1.3.noarch.rpm"
RPM_HASH = "d1a7cc1561f4cca6e4eae0876b62b06abbf556d4edbdac50fb08e205377ae16048d1e93ac6250b3beeb097b5c5b61aef0818b2e4d7b9e1b0dfe28af7f904b01d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipyparallel \
python39-ipyparallel \
python39-jupyter-ipyparallel \
python3dist-ipyparallel"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-decorator \
python39-entrypoints \
python39-ipykernel \
python39-ipython \
python39-jupyter-client \
python39-psutil \
python39-python-dateutil \
python39-pyzmq \
python39-tornado \
python39-tqdm \
python39-traitlets \
update-alternatives"

inherit rpm
