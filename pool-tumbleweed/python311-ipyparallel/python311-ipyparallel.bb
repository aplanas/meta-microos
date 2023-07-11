SUMMARY = "Interactive parallel computing library for IPython"
DESCRIPTION = "Use multiple instances of IPython in parallel, interactively. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "8.6.1"

RPM_NAME = "python311-ipyparallel-8.6.1-1.3.noarch.rpm"
RPM_HASH = "a7dd51388881de0dba406b96523e33f149f90a351e68b9639912c8954cca07bd652ddd1881b9082fb3ed72a999d4b0176a9bfb21382eac4436b546c1c96f3222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyparallel \
python3-jupyter-ipyparallel \
python3.11dist-ipyparallel \
python311-ipyparallel \
python311-jupyter-ipyparallel \
python3dist-ipyparallel"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-decorator \
python311-entrypoints \
python311-ipykernel \
python311-ipython \
python311-jupyter-client \
python311-psutil \
python311-python-dateutil \
python311-pyzmq \
python311-tornado \
python311-tqdm \
python311-traitlets \
update-alternatives"

inherit rpm
